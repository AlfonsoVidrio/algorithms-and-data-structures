package com.alfonsovidrio.algorithmsdatastructures.stackqueue.exercise1;

/*
 * Implement a MyQueue class using two stacks.
 *
 * We will use the Deque interface as our Stack, since it provides the operations of a double-ended queue,
 * allowing it to be used as either a Stack or a Queue (only Stack operations are allowed in this exercise).
 *
 * Java also has a Stack class, but its use is not recommended because it extends the Vector class,
 * which does not make much sense, and because it is a specific class rather than an interface.
 * If you want to learn more about this topic, you can check the following link:
 * https://stackoverflow.com/questions/12524826/why-should-i-use-deque-over-stack
 */

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueWithStacks {
    Deque<Integer> firstStack = new ArrayDeque<>();
    Deque<Integer> secondStack = new ArrayDeque<>();

    public void add(Integer value) {
        firstStack.push(value);
    }

    public Integer remove() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        dumpElementsIntoSecondStack();
        return secondStack.pop();
    }

    public Integer peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        dumpElementsIntoSecondStack();
        return secondStack.peek();
    }

    private void dumpElementsIntoSecondStack() {
        if (secondStack.isEmpty()) {
            while(!firstStack.isEmpty()) {
                secondStack.push(firstStack.pop());
            }
        }
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return firstStack.size() + secondStack.size();
    }
}
