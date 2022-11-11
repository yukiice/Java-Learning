package com.LinearList.Stack.InOut;

import java.util.NoSuchElementException;

public class Link<E> {
    private final Node<E> head = new Node<>(null);
    public static class Node<E>{
        E element;
        Node<E> next;
        public Node(E element){
            this.element = element;
        }
    }

    public void add(E element){
        Node<E> node = new Node<>(element);
        node.next = head.next;
        head.next = node;
    }
    public E pop(){
        if (isEmpty())
            throw new NoSuchElementException("栈为空");
        E e  = head.next.element;
        head.next = head.next.next;
        return e;
    }

    public boolean isEmpty(){
        return head.next == null;
    }
}
