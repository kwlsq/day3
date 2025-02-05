package org.vincent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountVowelsTest {

    @Test
    void vowelsCounter() {
        assertEquals(3, CountVowels.vowelsCounter("programming"));
        assertEquals(4, CountVowels.vowelsCounter("proogramming"));
    }
}