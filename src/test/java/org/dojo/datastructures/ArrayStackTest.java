package org.dojo.datastructures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayStackTest {

    @Test
    void stackDoesBasicOperationsCorrectly() {
        var stack = new ArrayStack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.peek());
        stack.pop();
        assertEquals(2, stack.pop());
        assertEquals(1, stack.peek());
    }

    @Test
    void emptyStackBehavesAsExpected() {
        var stack = new ArrayStack<Integer>();
        assertTrue(stack.isEmpty());
        assertNull(stack.peek());
        stack.push(1);
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    void stackGrowsAsExpected() {
        var stack = new ArrayStack<Integer>();
        for (int i = 0; i < 20; i++) {
            stack.push(i);
        }
        assertEquals(19, stack.peek());
    }
}