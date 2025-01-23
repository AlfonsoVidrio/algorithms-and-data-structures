package com.alfonsovidrio.algorithmsdatastructures.exercise3;

import com.alfonsovidrio.algorithmsdatastructures.linkedlists.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NthNodeToLastTest {

    @Test
    void nthNodeToLastTest() {
        NthNodeToLast nthNodeToLast = new NthNodeToLast();
        Node list = new Node(1);
        list.next = new Node(2);
        list.next.next = new Node(4);
        list.next.next.next = new Node(6);

        assertEquals(6, nthNodeToLast.nthNodeToLast(list, 1).value);
        assertEquals(4, nthNodeToLast.nthNodeToLast(list, 2).value);
        assertEquals(2, nthNodeToLast.nthNodeToLast(list, 3).value);
        assertEquals(1, nthNodeToLast.nthNodeToLast(list, 4).value);
        assertNull(nthNodeToLast.nthNodeToLast(list, 5));
    }
}