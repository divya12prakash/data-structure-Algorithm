package com.dp.coredatastructures;

public class StackLinkedList<E> {
    
    private int size = 0;
    private Node<E> head,tail;
    
    private static class Node<E>{
        private E element;
        private Node<E> prev, next;
        
        public Node(Node<E> prev, E element, Node<E> next){
            this.element = element;
            this.prev = prev;
            this.next = next;
        }
    }
    
    public void push(E element){
        Node<E> newNode = new Node<E>(null,element,null);
        if(size == 0){
            head = newNode;
            tail = newNode;
        }else{
            head.prev = newNode;
            head = newNode;
        }
    }
    
    
    public Node<E> pop(){
        Node<E> returnedHead = head;
        head.next.prev = null;
        head = head.next;
        return returnedHead;
    }
    
    
    
}
