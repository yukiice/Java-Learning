package com.LinearList.ChainTable.collection;

public class Chain<E> {

    private Node<E> head = new Node<>(null);
    private int size = 0;
    private  static  class  Node<E>{
        private E element;
        private Node<E> next;
        public Node(E element){
            this.element = element;
        }
    }



//    添加元素
    public void add(E element,int index){
        if (index > size || index <0)
            throw new IndexOutOfBoundsException("插入位置非法,合法位置为0~"+size);
        Node<E> prev = head;
        for (int i = 0; i < index;i++)
            prev = prev.next;
        Node<E> node = new Node<>(element);
        node.next = prev.next;
        prev.next = node;
        size++;
    }

    public E delete(int index){
        if (index > size || index < 0)
            throw new IndexOutOfBoundsException("删除的位置不合法，合法的位置为0~"+size);
        Node<E> prev = head;
        for (int i=0;i<index;i++)
            prev = prev.next;
        E e = prev.next.element;
        prev.next = prev.next.next;
        size--;
        return e;
    }

    public E getIndex(int index){
        if (index < 0 || index > size - 1 )
            throw new IndexOutOfBoundsException("非法位置,合法位置为0~"+size);
        Node<E> node = head;
        while (index-- >=0)
            node = node.next;
        return  node.element;
    }


    public String toString(){
        StringBuilder builder =  new StringBuilder();
        Node<E> node = head.next;
        while (node != null){
            builder.append(node.element).append(" ");
            node = node.next;
        }
        return  builder.toString();
    }

}
