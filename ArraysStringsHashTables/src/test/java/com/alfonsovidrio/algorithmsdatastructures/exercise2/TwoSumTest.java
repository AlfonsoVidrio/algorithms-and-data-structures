package com.alfonsovidrio.algorithmsdatastructures.exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSum() {
        int[] array = new int[] {9, 2, 5, 6};
        TwoSum twoSum = new TwoSum();
        int [] result = twoSum.twoSum(array, 7);
        assertTrue((result[0] == 1 && result[1] == 2) || (result[0] == 2 && result[1] == 1));
        assertEquals(null, twoSum.twoSum(array,  50));
    }
}