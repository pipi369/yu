package com.pipi.data;

import java.util.EmptyStackException;

public class LinkedQueue {

    public static class Node {

        int val;

        Node next;

    }

    private Node head = null;

    private Node tail = null;

    public boolean enqueue(int val) {
        Node newNode = new Node();
        newNode.val = val;

        if (head == null) {
            head = newNode;
        }

        if (tail == null) {
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }

        return true;
    }

    public int dequeue() {
        if (head == null) {
            throw new EmptyStackException();
        }

        int val = head.val;
        head = head.next;

        return val;
    }

    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }

}
