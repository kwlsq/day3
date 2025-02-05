package org.vincent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void fibonacciGenerator() {
        assertEquals("0 1 1 2 3 5", Fibonacci.fibonacciGenerator(6));
        assertEquals("0", Fibonacci.fibonacciGenerator(1));
        assertEquals("0 1", Fibonacci.fibonacciGenerator(2));
        assertEquals("0 1 1 2 3 5 8 13 21 34", Fibonacci.fibonacciGenerator(10));
    }
}