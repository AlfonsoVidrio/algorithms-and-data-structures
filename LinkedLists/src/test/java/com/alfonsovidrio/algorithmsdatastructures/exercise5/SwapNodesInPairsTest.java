package com.alfonsovidrio.algorithmsdatastructures.exercise5;

import com.alfonsovidrio.algorithmsdatastructures.linkedlists.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapNodesInPairsTest {

    @Test
    void swapNodesInPairs() {
        SwapNodesInPairs swap = new SwapNodesInPairs();
        Node list = new Node(1);
        list.next = new Node(2);
        list.next.next = new Node(4);
        list.next.next.next = new Node(6);
        list.next.next.next.next = new Node(8);

        Node result = swap.swapNodesInPairs(list);

        assertEquals(2, result.value);
        assertEquals(1, result.next.value);
        assertEquals(6, result.next.next.value);
        assertEquals(4, result.next.next.next.value);
        assertEquals(8, result.next.next.next.next.value);
    }
}