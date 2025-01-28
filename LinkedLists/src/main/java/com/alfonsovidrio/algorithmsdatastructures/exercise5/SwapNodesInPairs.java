package com.alfonsovidrio.algorithmsdatastructures.exercise5;

/*
 * Write an algorithm that swaps adjacent pairs of nodes without
 * modifying the internal value of the nodes.
 *
 * Example:
 *   Input: 1->2->4->6->8
 *   Output: 2->1->6->4->8
 */

import com.alfonsovidrio.algorithmsdatastructures.linkedlists.Node;

public class SwapNodesInPairs {

    public Node swapNodesInPairs(Node head) {
        if (head == null || head.next == null) return head;

        Node tmp = head.next.next; // 4->6->8
        head.next.next = head; // 1->2->1...
        head = head.next; // 2->1...
        head.next.next = swapNodesInPairs(tmp);
        return head;
    }
}
