package org.vincent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramsTest {

    @Test
    void isAnagrams() {
        assertEquals(true, Anagrams.isAnagrams("listen","silent"));
        assertEquals(false, Anagrams.isAnagrams("hello","world"));
    }
}