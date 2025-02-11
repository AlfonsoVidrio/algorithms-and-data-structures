package com.alfonsovidrio.algorithmsdatastructures.stackqueue.exercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueWithStacksTest {

    @Test
    public void queueWithStacksTest() {
        QueueWithStacks queueWithStacks = new QueueWithStacks();

        assertEquals(0,queueWithStacks.size());
        queueWithStacks.add(1);
        queueWithStacks.add(2);
        queueWithStacks.add(3);
        assertEquals(1,queueWithStacks.remove());
        assertEquals(2,queueWithStacks.peek());
        assertEquals(2,queueWithStacks.size());
        queueWithStacks.add(4);
        assertFalse(queueWithStacks.isEmpty());
        assertEquals(2,queueWithStacks.remove());
        assertEquals(3,queueWithStacks.remove());
        assertEquals(4,queueWithStacks.remove());
        assertTrue(queueWithStacks.isEmpty());

        assertThrows(IllegalStateException.class, queueWithStacks::remove);
    }
}