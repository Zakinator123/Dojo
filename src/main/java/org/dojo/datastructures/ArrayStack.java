package org.dojo.datastructures;

import java.util.Arrays;

public class ArrayStack<E> implements Stack<E> {
    private E[] elements;
    private int size;
    private static final int INITIAL_STACK_CAPACITY = 10;

    @SuppressWarnings("unchecked")
    public ArrayStack() {
        this.elements = (E[]) new Object[INITIAL_STACK_CAPACITY];
        this.size = 0;
    }

    @Override
    public void push(E element) {
        increaseArraySizeIfFull();
        elements[size++] = element;
    }

    @Override
    public E pop() {
        if (isEmpty()) throw new RuntimeException();
        return elements[--size];
    }

    @Override
    public E peek() {
        if (isEmpty()) return null;
        return elements[size-1];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private void increaseArraySizeIfFull() {
        if (this.size == this.elements.length) {
            elements = Arrays.copyOf(elements, size*2);
        }
    }
}
