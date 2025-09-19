package com.example;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderServiceTest {

    @Test
    public void testCalculateTotal() {
        assertEquals(40, OrderService.calculateTotal(Arrays.asList(10, 20, 10)));
    }

    @Test
    public void testCalculateTotalWithDuplicates() {
        // Test case: [5, 5, 5, 3, 3] = 5*3 + 3*2 = 15 + 6 = 21
        assertEquals(21, OrderService.calculateTotal(Arrays.asList(5, 5, 5, 3, 3)));
    }

    @Test
    public void testCalculateTotalSingleItem() {
        // Test case: [7] = 7*1 = 7
        assertEquals(7, OrderService.calculateTotal(Arrays.asList(7)));
    }

    @Test
    public void testCalculateTotalAllSameItems() {
        // Test case: [4, 4, 4, 4] = 4*4 = 16
        assertEquals(16, OrderService.calculateTotal(Arrays.asList(4, 4, 4, 4)));
    }

    @Test
    public void testCalculateTotalAllUniqueItems() {
        // Test case: [1, 2, 3, 4] = 1*1 + 2*1 + 3*1 + 4*1 = 10
        assertEquals(10, OrderService.calculateTotal(Arrays.asList(1, 2, 3, 4)));
    }

    @Test
    public void testCalculateTotalEmptyList() {
        // Test case: [] = 0
        assertEquals(0, OrderService.calculateTotal(Collections.emptyList()));
    }

    @Test
    public void testCalculateTotalWithZeros() {
        // Test case: [0, 5, 0, 3] = 0*2 + 5*1 + 3*1 = 0 + 5 + 3 = 8
        assertEquals(8, OrderService.calculateTotal(Arrays.asList(0, 5, 0, 3)));
    }

    @Test
    public void testCalculateTotalLargerList() {
        // Test case: [1, 2, 1, 3, 2, 1, 4] = 1*3 + 2*2 + 3*1 + 4*1 = 3 + 4 + 3 + 4 = 14
        assertEquals(14, OrderService.calculateTotal(Arrays.asList(1, 2, 1, 3, 2, 1, 4)));
    }

    @Test
    public void testCalculateTotalWithNegativeNumbers() {
        // Test case: [-2, 3, -2, 3] = -2*2 + 3*2 = -4 + 6 = 2
        assertEquals(2, OrderService.calculateTotal(Arrays.asList(-2, 3, -2, 3)));
    }
}
