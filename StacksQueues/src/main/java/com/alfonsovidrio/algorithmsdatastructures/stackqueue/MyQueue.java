package com.alfonsovidrio.algorithmsdatastructures.stackqueue;

public class MyQueue {
    private Node first;
    private Node last;
    private int count = 0;

    public void add(int value) {
        Node newLast = new Node(value);
        if (last != null) {
            last.next = newLast;
        }
        last = newLast;
        if (first == null) {
            first = last;
        }
        count++;
    }

    public int remove() {
        int firstValue = peek();
        first = first.next;
        if (isEmpty()) {
            last = null;
        }
        count--;
        return firstValue;
    }

    public int peek() {
        if (isEmpty()) {
            throw new MyEmptyException("The queue is empty");
        }
        return first.value;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return count;
    }

    public void clear() {
        first = null;
        last = null;
        count = 0;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
            return;
        }
        Node current = first;
        System.out.print("Queue: ");
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}
