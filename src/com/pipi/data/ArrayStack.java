package com.pipi.data;

import java.util.EmptyStackException;

public class ArrayStack {

    private int index = 0;

    private int length = 8;

    private int[] stack = new int[length];

    public void push(int val) {
        if (index >= length) {
            throw new StackOverflowError();
        }

        stack[index] = val;
        index++;
    }

    public int pop() {
        if (index <= 0) {
            throw new EmptyStackException();
        }
        int val = stack[index - 1];
        index --;
        return val;
    }


    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

}
