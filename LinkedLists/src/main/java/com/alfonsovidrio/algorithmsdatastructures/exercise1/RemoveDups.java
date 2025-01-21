package com.alfonsovidrio.algorithmsdatastructures.exercise1;

/*
 * Write an algorithm to remove duplicate elements from a Linked List.
 *
 * Example:
 *    Input: 1->2->2->3->4->1
 *    Output: 1->2->3->4
 *
 * Follow-up: What would your solution be if you could not use additional memory?
 */

import com.alfonsovidrio.algorithmsdatastructures.linkedlists.Node;

import java.util.HashSet;

public class RemoveDups {

    public void removeDups (Node head) {
        // if the list is empty, return
        if (head == null) return;

        HashSet<Integer> foundValues = new HashSet<>();
        Node current = head;
        foundValues.add(current.value);

        while (current != null && current.next != null) {
            // if the next node's value is already in the set, delete it
            if (!foundValues.add(current.next.value)) {
                current.next = current.next.next;
            }
            // move to the next node
            current = current.next;
        }

    }
}
