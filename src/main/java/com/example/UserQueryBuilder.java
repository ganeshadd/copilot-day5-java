package com.example;

import java.util.*;
import java.util.stream.Collectors;

/**
 * A SQL query builder for fetching user data with proper parameterization to prevent SQL injection.
 * Supports various query operations like SELECT, WHERE, JOIN, ORDER BY, etc.
 *
 * Security: Uses parameterized queries to prevent SQL injection attacks
 * Flexibility: Supports method chaining for readable query construction
 */
public class UserQueryBuilder {

    private final List<String> selectColumns;
    private final List<String> fromTables;
    private final List<WhereCondition> whereConditions;
    private final List<String> joinClauses;
    private final List<String> orderByColumns;
    private final Map<String, Object> parameters;
    private int limit;
    private int offset;

    public UserQueryBuilder() {
        this.selectColumns = new ArrayList<>();
        this.fromTables = new ArrayList<>();
        this.whereConditions = new ArrayList<>();
        this.joinClauses = new ArrayList<>();
        this.orderByColumns = new ArrayList<>();
        this.parameters = new HashMap<>();
        this.limit = -1;
        this.offset = -1;
    }

    /**
     * Add columns to SELECT clause
     */
    public UserQueryBuilder select(String... columns) {
        if (columns == null || columns.length == 0) {
            throw new IllegalArgumentException("At least one column must be specified");
        }
        Collections.addAll(this.selectColumns, columns);
        return this;
    }

    /**
     * Add table to FROM clause
     */
    public UserQueryBuilder from(String table) {
        if (table == null || table.trim().isEmpty()) {
            throw new IllegalArgumentException("Table name cannot be null or empty");
        }
        this.fromTables.add(sanitizeIdentifier(table));
        return this;
    }

    /**
     * Add WHERE condition for user ID (most common use case)
     */
    public UserQueryBuilder whereUserId(Long userId) {
        if (userId == null) {
            throw new IllegalArgumentException("User ID cannot be null");
        }
        return where("user_id", "=", userId);
    }

    /**
     * Add WHERE condition with parameterized value
     */
    public UserQueryBuilder where(String column, String operator, Object value) {
        if (column == null || column.trim().isEmpty()) {
            throw new IllegalArgumentException("Column name cannot be null or empty");
        }
        if (operator == null || operator.trim().isEmpty()) {
            throw new IllegalArgumentException("Operator cannot be null or empty");
        }
        if (value == null) {
            throw new IllegalArgumentException("Value cannot be null");
        }

        String paramName = generateParameterName(column);
        whereConditions.add(new WhereCondition(sanitizeIdentifier(column), operator, paramName));
        parameters.put(paramName, value);
        return this;
    }

    /**
     * Add WHERE IN condition for multiple values
     */
    public UserQueryBuilder whereIn(String column, Collection<?> values) {
        if (column == null || column.trim().isEmpty()) {
            throw new IllegalArgumentException("Column name cannot be null or empty");
        }
        if (values == null || values.isEmpty()) {
            throw new IllegalArgumentException("Values collection cannot be null or empty");
        }

        List<String> paramNames = new ArrayList<>();
        int index = 0;
        for (Object value : values) {
            String paramName = generateParameterName(column) + "_" + index++;
            paramNames.add(":" + paramName);
            parameters.put(paramName, value);
        }

        String inClause = paramNames.stream().collect(Collectors.joining(", ", "(", ")"));
        whereConditions.add(new WhereCondition(sanitizeIdentifier(column), "IN", inClause, false));
        return this;
    }

    /**
     * Add JOIN clause
     */
    public UserQueryBuilder join(String table, String onCondition) {
        if (table == null || table.trim().isEmpty()) {
            throw new IllegalArgumentException("Table name cannot be null or empty");
        }
        if (onCondition == null || onCondition.trim().isEmpty()) {
            throw new IllegalArgumentException("ON condition cannot be null or empty");
        }

        joinClauses.add("JOIN " + sanitizeIdentifier(table) + " ON " + onCondition);
        return this;
    }

    /**
     * Add LEFT JOIN clause
     */
    public UserQueryBuilder leftJoin(String table, String onCondition) {
        if (table == null || table.trim().isEmpty()) {
            throw new IllegalArgumentException("Table name cannot be null or empty");
        }
        if (onCondition == null || onCondition.trim().isEmpty()) {
            throw new IllegalArgumentException("ON condition cannot be null or empty");
        }

        joinClauses.add("LEFT JOIN " + sanitizeIdentifier(table) + " ON " + onCondition);
        return this;
    }

    /**
     * Add ORDER BY clause
     */
    public UserQueryBuilder orderBy(String column, String direction) {
        if (column == null || column.trim().isEmpty()) {
            throw new IllegalArgumentException("Column name cannot be null or empty");
        }

        direction = direction != null ? direction.toUpperCase() : "ASC";
        if (!direction.equals("ASC") && !direction.equals("DESC")) {
            throw new IllegalArgumentException("Direction must be ASC or DESC");
        }

        orderByColumns.add(sanitizeIdentifier(column) + " " + direction);
        return this;
    }

    /**
     * Add ORDER BY ASC (convenience method)
     */
    public UserQueryBuilder orderByAsc(String column) {
        return orderBy(column, "ASC");
    }

    /**
     * Add ORDER BY DESC (convenience method)
     */
    public UserQueryBuilder orderByDesc(String column) {
        return orderBy(column, "DESC");
    }

    /**
     * Add LIMIT clause
     */
    public UserQueryBuilder limit(int limit) {
        if (limit < 0) {
            throw new IllegalArgumentException("Limit must be non-negative");
        }
        this.limit = limit;
        return this;
    }

    /**
     * Add OFFSET clause
     */
    public UserQueryBuilder offset(int offset) {
        if (offset < 0) {
            throw new IllegalArgumentException("Offset must be non-negative");
        }
        this.offset = offset;
        return this;
    }

    /**
     * Build the final SQL query string
     */
    public String buildQuery() {
        if (selectColumns.isEmpty()) {
            throw new IllegalStateException("SELECT columns must be specified");
        }
        if (fromTables.isEmpty()) {
            throw new IllegalStateException("FROM table must be specified");
        }

        StringBuilder query = new StringBuilder();

        // SELECT clause
        query.append("SELECT ")
             .append(String.join(", ", selectColumns));

        // FROM clause
        query.append(" FROM ")
             .append(String.join(", ", fromTables));

        // JOIN clauses
        if (!joinClauses.isEmpty()) {
            query.append(" ")
                 .append(String.join(" ", joinClauses));
        }

        // WHERE clause
        if (!whereConditions.isEmpty()) {
            query.append(" WHERE ");
            List<String> conditions = whereConditions.stream()
                .map(WhereCondition::toString)
                .collect(Collectors.toList());
            query.append(String.join(" AND ", conditions));
        }

        // ORDER BY clause
        if (!orderByColumns.isEmpty()) {
            query.append(" ORDER BY ")
                 .append(String.join(", ", orderByColumns));
        }

        // LIMIT clause
        if (limit > 0) {
            query.append(" LIMIT ").append(limit);
        }

        // OFFSET clause
        if (offset > 0) {
            query.append(" OFFSET ").append(offset);
        }

        return query.toString();
    }

    /**
     * Get the parameters map for prepared statement
     */
    public Map<String, Object> getParameters() {
        return new HashMap<>(parameters);
    }

    /**
     * Create a new query builder instance (factory method)
     */
    public static UserQueryBuilder create() {
        return new UserQueryBuilder();
    }

    /**
     * Convenience method to create a simple user lookup by ID
     */
    public static QueryResult getUserById(Long userId) {
        if (userId == null) {
            throw new IllegalArgumentException("User ID cannot be null");
        }

        UserQueryBuilder builder = UserQueryBuilder.create()
            .select("user_id", "username", "email", "first_name", "last_name", "created_at", "updated_at")
            .from("users")
            .whereUserId(userId);

        return new QueryResult(builder.buildQuery(), builder.getParameters());
    }

    /**
     * Convenience method to get users with profile information
     */
    public static QueryResult getUserWithProfile(Long userId) {
        if (userId == null) {
            throw new IllegalArgumentException("User ID cannot be null");
        }

        UserQueryBuilder builder = UserQueryBuilder.create()
            .select("u.user_id", "u.username", "u.email", "u.first_name", "u.last_name",
                   "p.bio", "p.avatar_url", "p.phone_number")
            .from("users u")
            .leftJoin("user_profiles p", "u.user_id = p.user_id")
            .whereUserId(userId);

        return new QueryResult(builder.buildQuery(), builder.getParameters());
    }

    // Helper methods
    private String generateParameterName(String column) {
        return "param_" + column.replaceAll("[^a-zA-Z0-9_]", "_") + "_" + parameters.size();
    }

    private String sanitizeIdentifier(String identifier) {
        if (identifier == null) {
            throw new IllegalArgumentException("Identifier cannot be null");
        }

        // Remove potentially dangerous characters and validate
        String sanitized = identifier.replaceAll("[^a-zA-Z0-9_.]", "");
        if (sanitized.isEmpty()) {
            throw new IllegalArgumentException("Invalid identifier: " + identifier);
        }

        return sanitized;
    }

    // Inner classes
    private static class WhereCondition {
        private final String column;
        private final String operator;
        private final String value;
        private final boolean addColon;

        public WhereCondition(String column, String operator, String value) {
            this(column, operator, value, true);
        }

        public WhereCondition(String column, String operator, String value, boolean addColon) {
            this.column = column;
            this.operator = operator;
            this.value = value;
            this.addColon = addColon;
        }

        @Override
        public String toString() {
            String paramValue = addColon && !value.startsWith(":") ? ":" + value : value;
            return column + " " + operator + " " + paramValue;
        }
    }

    /**
     * Result container for query and parameters
     */
    public static class QueryResult {
        private final String query;
        private final Map<String, Object> parameters;

        public QueryResult(String query, Map<String, Object> parameters) {
            this.query = query;
            this.parameters = parameters;
        }

        public String getQuery() {
            return query;
        }

        public Map<String, Object> getParameters() {
            return parameters;
        }

        @Override
        public String toString() {
            return "QueryResult{" +
                   "query='" + query + '\'' +
                   ", parameters=" + parameters +
                   '}';
        }
    }
}
