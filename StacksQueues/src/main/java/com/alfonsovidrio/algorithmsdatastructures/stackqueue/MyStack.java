package com.alfonsovidrio.algorithmsdatastructures.stackqueue;

public class MyStack {
    private Node top;
    private int count = 0;

    public void push(int value) {
        Node newTop = new Node(value);
        newTop.next = top;
        top = newTop;
        count++;
    }

    public int pop() {
        int topValue = peek();
        top = top.next;
        count--;
        return topValue;
    }

    public int peek() {
        if (isEmpty()) {
            throw new MyEmptyException("The stack is empty");
        }
        return top.value;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return count;
    }

    public void clear() {
        top = null;
        count = 0;
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return;
        }
        Node current = top;
        System.out.print("Stack (top to bottom): ");
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}
