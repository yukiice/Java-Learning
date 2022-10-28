package com.LinearList.Hash.Test;

public class Person<E> {
    public static void main(String[] args) {

    }
    private  final int TABLE_SIZE = 10;
    private final Node<E>[] Table = new Node[TABLE_SIZE];

    public int hash(E obj){
        int hashCode = obj.hashCode();
        return  hashCode % TABLE_SIZE;
    }

    public Person(){
        for (int i =0;i < TABLE_SIZE;i++)
            Table[i] = new Node<>(null);
    }

    public void insert(E obj){
        int index = hash(obj);
        Node<E> prev = Table[index];
        while (prev.next != null)
            prev = prev.next;
        prev.next = new Node<>(obj);
    }

    public boolean contains(E element){
        int index = hash(element);
        Node<E> node  =Table[index].next;
        while (node != null){
            if (node.element == element)
                return  true;
            node = node.next;
        }
        return  false;
    }

    public static class Node<E>{
        private final E element;
        private Node<E> next;
        private Node(E element){
            this.element = element;
        }
    }

//    重写
    public String toString(){
        StringBuilder builder = new StringBuilder();
        for (int i = 0;i < TABLE_SIZE; i++){
            Node<E> head = Table[i].next;
            while (head != null){
                builder.append(head.element).append("-->");
                head = head.next;
            }
            builder.append("\n");
        }

        return builder.toString();



    }

}

