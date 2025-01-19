package com.alfonsovidrio.algorithmsdatastructures.exercise3;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {

    @Test
    void groupAnagrams() {
        List<List<String>> empty = GroupAnagrams.groupAnagrams(new String[] {});
        assertTrue(empty.isEmpty());

        List<List<String>>anagrams = GroupAnagrams.groupAnagrams(new String[] {"saco", "arresto", "programa", "rastreo", "caso"});

        assertTrue(anagrams.size() == 3); // [["saco", "caso"], ["arresto", "rastreo"], ["programa"]]
        assertTrue(containsAll(anagrams, List.of("programa")));
        assertTrue(containsAll(anagrams, List.of("caso","saco")));
        assertTrue(containsAll(anagrams, List.of("arresto", "rastreo")));
    }

    private boolean containsAll(List<List<String>> anagrams, List<String> group) {
        for (List<String> g : anagrams) {
            if (g.containsAll(group)) return true;
        }
        return false;
    }


}