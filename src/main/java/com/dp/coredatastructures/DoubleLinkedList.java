package com.dp.coredatastructures;

/**
 * We will implement Double Linked List with the help
 * of Node class that is defined.
 */
public class DoubleLinkedList<E> {

    private int size = 0;
    private Node<E> head;
    private Node<E> tail;

    private static class Node<E> {
        private E data;
        private Node<E> prev, next;

        public Node(Node<E> prev, E element, Node<E> next) {
            this.data = element;
            this.prev = prev;
            this.next = next;
        }

    }

    public void clear() {
        Node<E> traversal = head;
        while (traversal != null) {
            Node<E> nextNode = traversal.next;
            traversal.next = traversal.prev = null;
            traversal.data = null;
            traversal = nextNode;
        }
        head = tail = traversal = null;
        size = 0;
    }

    /**
     * Add to end of the list
     *
     * @param elem
     */
    public void add(E elem) {
        Node<E> newNode = new Node<E>(tail, elem, null);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void addFirst(E elem) {
        Node<E> newNode = new Node<E>(null, elem, head);
        if (head == null) {
            head = tail = newNode;
        } else {
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addAt(int index, E elem) throws Exception {
        if (index < 0) {
            throw new Exception("Invalid index");
        }
        if (index == 0) {
            addFirst(elem);
            return;
        }
        if (index == size) {
            add(elem);
            return;
        }

        Node<E> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        Node<E> newNode = new Node<E>(temp, elem, temp.next);

        temp.next = newNode;
        temp.next.prev = newNode;

    }


}
