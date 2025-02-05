package org.vincent;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramsTest {

    @Test
    @DisplayName("Anagrams checker test with valid inputs")
    void isAnagrams() {
        assertEquals(true, Anagrams.isAnagrams("listen","silent"));
        assertEquals(false, Anagrams.isAnagrams("hello","world"));
    }
}