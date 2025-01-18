package com.alfonsovidrio.algorithmsdatastructures.exercise2;
/*
 * Given an array of integers and a target, return the indices of two
 * numbers such that their sum is equal to the target.
 *
 * You can assume there is exactly one solution.
 *
 * Example 1:
 *  Input: nums = [9, 2, 5, 6], target = 7
 *  Output: [1, 2]
 *
 * Example 2:
 *   Input: nums = [9, 2, 5, 6], target = 100
 *   Output: null
 */

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length < 2) return null;

        Map<Integer, Integer> complementMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (complementMap.containsKey(nums[i])) return new int[]{complementMap.get(nums[i]), i};
            int complement = target - nums[i];
            complementMap.put(complement, i);
        }
        return null;
    }
}
