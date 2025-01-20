package com.alfonsovidrio.algorithmsdatastructures.linkedlists;

public class SingleLinkedList {
    public Node head;

    public void appendToTail(int value) {
        // if the list is empty, create a new node and assign it to head
        if (head == null) {
            head = new Node(value);
            return;
        }

        Node current = head;
        // traverse the list until the last node
        while (current.next != null) {
            current = current.next;
        }
        // create a new node and assign it to the last node's next
        current.next = new Node(value);
    }

    public void deleteNode(int value) {
        // if the list is empty, return
        if (head == null) return;

        // if the head is the node to delete, assign the next node to head
        if (head.value == value) {
            head = head.next;
            return;
        }
        // traverse the list until the node before the node to delete
        Node current = head;
        while (current.next != null) {
            if (current.next.value == value) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void print() {
        if (head == null) {
            System.out.println("END");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("END");
    }
}