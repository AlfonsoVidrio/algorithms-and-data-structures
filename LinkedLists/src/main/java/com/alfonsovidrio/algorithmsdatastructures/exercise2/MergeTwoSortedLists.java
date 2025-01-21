package com.alfonsovidrio.algorithmsdatastructures.exercise2;

/*
 * Write an algorithm to merge two sorted singly linked lists.
 * The result should be a single sorted linked list. Return its head.
 *
 *  Example:
 *    Input: 1->2->4->6,   2->3->5
 *    Output: 1->2->2->3->4->5->6
 */

import com.alfonsovidrio.algorithmsdatastructures.linkedlists.Node;

public class MergeTwoSortedLists {

    public Node mergeTwoLists(Node list1, Node list2) {
        Node aux = new Node(-1);
        Node current = aux;

        while (list1 != null && list2 != null) {
            if (list1.value <= list2.value) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return aux.next;
    }
}