package org.vincent;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondSmallestTest {

    @Test
    @DisplayName("Second smallest value finder test with valid inputs")
    void secondSmalelstValueFinder() {
        assertEquals(2, SecondSmallest.secondSmalelstValueFinder(new int[]{5, 3, 8, 1, 2, 9}));
        assertEquals(3, SecondSmallest.secondSmalelstValueFinder(new int[]{5, 3, 8, 1, 10, 9}));
    }
}