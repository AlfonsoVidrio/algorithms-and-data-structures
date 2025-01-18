package com.alfonsovidrio.algorithmsdatastructures.exercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsUniqueTest {

    @Test
    public void isUniqueTest() {
        IsUnique isUnique = new IsUnique();
        assertTrue(isUnique.isUnique("abcde"));
        assertTrue(isUnique.isUnique("aAbBcCdDeE"));
        assertFalse(isUnique.isUnique("abcded"));
    }
}