package com.alfonsovidrio.algorithmsdatastructures.exercise3;

import java.util.*;

/*
 * An anagram is a word created by rearranging the letters of another word. E.g., "saco" - "caso".
 * Given an array of Strings, return the anagrams grouped together. Any order is valid.
 *
 * Example:
 *   Input: words = ["saco", "arresto", "programa", "rastreo", "caso"].
 *   Output: [["saco", "caso"], ["arresto", "rastreo"], ["programa"]].
 */

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] words) {
        if (words == null || words.length == 0) return Collections.emptyList();

        Map<String, List<String>> anagramMap = buildAnagramMap(words);
        return new ArrayList<>(anagramMap.values());
    }

    private static Map<String, List<String>> buildAnagramMap(String[] words) {
        Map<String, List<String>> map = new HashMap<>();
        for (String word : words) {
            String hash = getAnagramHash(word);
            if (!map.containsKey(hash)) {
                map.put(hash, new ArrayList<>());
            }
            map.get(hash).add(word);
        }
        return map;
    }

    private static String getAnagramHash(String str) {
        int [] letterCount = new int[26];
        for (int c : str.toCharArray()) {
            letterCount[c - 'a']++;
        }
        return Arrays.toString(letterCount);
    }
}
