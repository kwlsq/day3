package org.vincent;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringReverseTest {

    @Test
    @DisplayName("String reverse test with valid inputs")
    void reverse() {
        assertEquals("olleh", StringReverse.reverse("hello"));
        assertEquals("o2lleh", StringReverse.reverse("hell2o"));
        assertEquals("gnabmab", StringReverse.reverse("bambang"));
        assertEquals("uk kekak ikak ukuk", StringReverse.reverse("kuku kaki kakek ku"));
    }
}