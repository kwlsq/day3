package org.vincent;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    @DisplayName("Bubble sorter test with valid inputs")
    void arraySorter() {
        assertArrayEquals(
                new int[] {11, 12, 22, 25, 34, 64, 90},
                BubbleSort.arraySorter(new int[]{64, 34, 25, 12, 22, 11, 90})
        );
        assertArrayEquals(
                new int[] {1, 2, 3, 4, 5, 64, 90},
                BubbleSort.arraySorter(new int[]{1, 2, 4, 5, 3, 90, 64})
        );

    }
}