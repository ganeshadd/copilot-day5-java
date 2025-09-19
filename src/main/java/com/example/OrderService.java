package com.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Optimized implementation: O(n) approach using HashMap to count occurrences efficiently.
 * Refactored from inefficient O(n^2) nested loop approach.
 */
public class OrderService {
    public static void main(String[] args) {
        System.out.println("OrderService application started.");
        // You can add more logic here as needed
    }

    public static int calculateTotal(List<Integer> items) {
        Map<Integer, Integer> counts = new HashMap<>();

        // Count occurrences of each item in O(n)
        for (int item : items) {
            counts.put(item, counts.getOrDefault(item, 0) + 1);
        }

        // Calculate total in O(unique items)
        int total = 0;
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            total += entry.getKey() * entry.getValue();
        }

        return total;
    }
}

