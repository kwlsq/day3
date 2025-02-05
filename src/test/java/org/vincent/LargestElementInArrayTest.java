package org.vincent;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestElementInArrayTest {

    @Test
    @DisplayName("Largest element finder test with valid inputs")
    void findLargestElement() {
        assertEquals(8, LargestElementInArray.findLargestElement(new int[]{3, 7, 2, 8, 1}));
        assertEquals(50, LargestElementInArray.findLargestElement(new int[]{2, 1, 50, 4, 3}));
        assertEquals(-2, LargestElementInArray.findLargestElement(new int[]{-2, -51, -50, -10, -3}));
    }
}