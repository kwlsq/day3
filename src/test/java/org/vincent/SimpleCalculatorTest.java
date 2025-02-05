package org.vincent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void calculator() {
        assertEquals(8, SimpleCalculator.calculator("+",new int[]{5,3}));
        assertEquals(15, SimpleCalculator.calculator("+",new int[]{5,3,1,1,2,3}));
        assertEquals(5, SimpleCalculator.calculator("/",new int[]{10,2}));
        assertEquals(1, SimpleCalculator.calculator("/",new int[]{10,2,5}));
        assertEquals(3, SimpleCalculator.calculator("-",new int[]{10,7}));
        assertEquals(6, SimpleCalculator.calculator("-",new int[]{10,2,2}));
        assertEquals(0, SimpleCalculator.calculator("*",new int[]{0,2,1}));
        assertEquals(18, SimpleCalculator.calculator("*",new int[]{3,2,3}));
    }
}