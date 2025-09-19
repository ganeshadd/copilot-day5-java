package com.example;

public class Day6Assignment {

    /**
     * Checks if a given number is prime.
     * A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.
     *
     * Time Complexity: O(√n)
     * Space Complexity: O(1)
     *
     * @param number the number to check (must be non-negative)
     * @return true if the number is prime, false otherwise
     * @throws IllegalArgumentException if number is negative
     */
    public static boolean isPrime(int number) {
        // Input validation - reject negative numbers
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative, got: " + number);
        }

        // Numbers less than or equal to 1 are not prime
        if (number <= 1) {
            return false;
        }

        // 2 is the only even prime number
        if (number == 2) {
            return true;
        }

        // Even numbers greater than 2 are not prime
        if (number % 2 == 0) {
            return false;
        }

        // Check odd divisors up to the square root of the number
        // If a number n has a divisor greater than sqrt(n),
        // it must also have a corresponding divisor less than sqrt(n)
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * Checks if a given long number is prime (for larger numbers).
     *
     * @param number the number to check (must be non-negative)
     * @return true if the number is prime, false otherwise
     * @throws IllegalArgumentException if number is negative
     */
    public static boolean isPrime(long number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative, got: " + number);
        }

        if (number <= 1) {
            return false;
        }

        if (number == 2) {
            return true;
        }

        if (number % 2 == 0) {
            return false;
        }

        for (long i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * Main method to demonstrate the isPrime function
     */
    public static void main(String[] args) {
        try {
            // Test the isPrime function with some examples
            int[] testNumbers = {-5, 0, 1, 2, 3, 4, 5, 17, 25, 29, 97, 100, Integer.MAX_VALUE};

            System.out.println("Prime number checker:");
            System.out.println("====================");

            for (int num : testNumbers) {
                try {
                    System.out.printf("%d is %s%n", num, isPrime(num) ? "prime" : "not prime");
                } catch (IllegalArgumentException e) {
                    System.out.printf("Error checking %d: %s%n", num, e.getMessage());
                }
            }

            // Test with larger numbers using long version
            System.out.println("\nTesting larger numbers:");
            long[] largePrimes = {982451653L, 982451654L, 2147483647L};
            for (long num : largePrimes) {
                System.out.printf("%d is %s%n", num, isPrime(num) ? "prime" : "not prime");
            }

        } catch (Exception e) {
            System.err.println("Unexpected error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
