package com.alfonsovidrio.algorithmsdatastructures.exercise4;

import com.alfonsovidrio.algorithmsdatastructures.linkedlists.Node;

/*
 * Write an algorithm to sum two linked lists that represent two positive integers.
 * The digits in the linked lists are stored in reverse order.
 *
 * Example:
 *   Input: 1->2->4->6 (represents 6421), 5->2->8 (represents 825)
 *   Output: 6->4->2->7 (represents 7246)
 */

public class AddTwoNumbers {

    public Node addTwoNumbers(Node list1, Node list2) {
        Node result = new Node(-1);
        Node current = result;
        int carry = 0;

        while (list1 != null || list2 != null) {
            current.next = new Node(-1);
            current = current.next;

            int digit = carry;

            if (list1 != null) {
                digit += list1.value;
                list1 = list1.next;
            }

            if (list2 != null) {
                digit += list2.value;
                list2 = list2.next;
            }

            carry = digit / 10;
            digit = digit % 10;

            current.value = digit;
        }

        if (carry > 0) {
            current.next = new Node(carry);
        }

        return result.next;
    }
}
