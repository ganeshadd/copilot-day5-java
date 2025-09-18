
package com.example;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderServiceTest {

    @Test
    public void testCalculateTotal() {
        assertEquals(40, OrderService.calculateTotal(Arrays.asList(10, 20, 10)));
    }

    @Test
    public void testCalculateTotalAsync() throws Exception {
        int expected = OrderService.calculateTotal(Arrays.asList(10, 20, 10));
        int asyncResult = OrderService.calculateTotalAsync(Arrays.asList(10, 20, 10)).get();
        assertEquals(expected, asyncResult);
    }

    @Test
    public void testCalculateTotalIdenticalOutput() throws Exception {
        java.util.List<java.util.List<Integer>> samples = java.util.Arrays.asList(
            java.util.Arrays.asList(1, 2, 3, 2, 1),
            java.util.Arrays.asList(5, 5, 5),
            java.util.Arrays.asList(100, 200, 300),
            java.util.Arrays.asList()
        );
        for (java.util.List<Integer> sample : samples) {
            int sync = OrderService.calculateTotal(sample);
            int async = OrderService.calculateTotalAsync(sample).get();
            assertEquals(sync, async);
        }
    }
}
