package org.vincent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberValidatorTest {

    @Test
    void isPrime() {
        assertFalse(PrimeNumberValidator.isPrime(1));
        assertTrue(PrimeNumberValidator.isPrime(2));
        assertTrue(PrimeNumberValidator.isPrime(5));
        assertTrue(PrimeNumberValidator.isPrime(7));
        assertTrue(PrimeNumberValidator.isPrime(17));
        assertFalse(PrimeNumberValidator.isPrime(49));
        assertFalse(PrimeNumberValidator.isPrime(25));
        assertFalse(PrimeNumberValidator.isPrime(4));
        assertFalse(PrimeNumberValidator.isPrime(8));
        assertFalse(PrimeNumberValidator.isPrime(88));
    }
}