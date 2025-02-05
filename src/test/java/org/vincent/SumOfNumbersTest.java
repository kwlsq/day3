package org.vincent;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfNumbersTest {

    @Test
    @DisplayName("Calculate rectangle area with valid inputs")
    void sum() {
        assertEquals(10, SumOfNumbers.sum("1234")); // 1+2+3+4 = 10
        assertEquals(15, SumOfNumbers.sum("54321")); // 5+4+3+2+1 = 15
        assertEquals(2, SumOfNumbers.sum("2")); // Single
    }
}