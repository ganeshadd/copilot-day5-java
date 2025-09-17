package com.example;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;
import java.util.List;

/*
 * Smelly implementation: O(n^2) approach that computes total by counting occurrences
 * (inefficient for large lists). Purpose: ask Copilot to refactor to O(n).
 */
public class OrderService {
    public static void main(String[] args) {
        System.out.println("OrderService application started.");
        // You can add more logic here as needed
    }

    public static int calculateTotal(List<Integer> items) {
        java.util.Map<Integer, Integer> freq = new java.util.HashMap<>();
        for (int val : items) {
            freq.put(val, freq.getOrDefault(val, 0) + 1);
        }
        int total = 0;
        for (java.util.Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            total += entry.getKey() * entry.getValue();
        }
        return total;
    }

    // Async streaming implementation using CompletableFuture
    public static CompletableFuture<Integer> calculateTotalAsync(List<Integer> items) {
        return CompletableFuture.supplyAsync(() -> calculateTotal(items));
    }
}
