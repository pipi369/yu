package com.pipi.data;

import java.util.EmptyStackException;

public class ArrayQueue {

    private int head = 0;

    private int tail = 0;

    private int length = 8;

    private int[] queue = new int[length];

    public boolean enqueue(int val) {
        if (tail >= length) {
            if (head == 0) {
                return false;
            }

            for (int i = head; i < tail; i++) {
                queue[i - head] = queue[i];
            }

            tail -= head;
            head = 0;

        }

        queue[tail++] = val;
        return true;
    }

    public int dequeue() {
        if (head == tail) {
            throw new EmptyStackException();
        }
        int val = queue[head];
        queue[head] = 0;
        head++;
        return val;
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        System.out.println(queue.dequeue());
        queue.enqueue(9);
        System.out.println(queue.dequeue());
        queue.enqueue(10);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }

}
