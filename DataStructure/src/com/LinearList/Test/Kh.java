package com.LinearList.Test;

import java.util.NoSuchElementException;

public class Kh {
    public boolean isValid(String s) {
        LinkedStack<Character> stack = new LinkedStack<>();
        char[] chars = s.toCharArray();
        for (char c : chars){
            if (c == '{' || c == '[' || c == '('){
                stack.push(c);
            }else{
                if (stack.isEmpty()) return  false;
                Character ch = stack.pop();
                if (c == ')' && ch !='(' ) return false;
                if (c == '}' && ch !='{' ) return false;
                if (c == ']' && ch !='[' ) return false;
            }
        }
        return  stack.isEmpty();
    }
    public static class LinkedStack<E>{
        private final Node<E> head = new Node<>(null);
        public static class Node<E>{
            E element;
            Node<E> next;
            public Node(E element){
                this.element = element;
            }
        }

        public boolean isEmpty() {
            return head.next == null;
        }



        public void  push(E element){
            Node<E> node = new Node<>(element);
            node.next = head.next;
            head.next = node;
        }

        public E pop(){
            if (isEmpty())
                throw new NoSuchElementException("栈为空");
            E e = head.next.element;
            head.next = head.next.next;
            return e;
        }
    }
 }
