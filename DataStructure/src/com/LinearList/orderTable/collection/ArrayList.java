package com.LinearList.orderTable.collection;

public class ArrayList<E> {
    private int size   = 0;
    private int capacity = 10;
    private Object[] array =  new Object[capacity];
    public void  add (E element,int index){
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("请输入合适的位置,合法位置是0~" + size);
        if (index >= size){
            int newCapacity = capacity + (capacity >> 1);
            Object[] newArr = new Object[newCapacity];
            System.arraycopy(array,0,newArr,0,size);
            array = newArr;
            capacity = newCapacity;
        }
        for (int i = size; i > index; i--)
            array[i] = array[i - 1];
        array[index] = element;
        size++;
    }
    
//    删除操作
    @SuppressWarnings("unchecked")
    public E remove(int index){
        if (index < 0 || index > size - 1)
            throw new IndexOutOfBoundsException("删除位置不合法,合法的为0~"+size);
        E e  = (E) array[index];
        for (int i = index;i < size; i++)
            array[i] = array[i+1];
        size--;
        return  e;
    }

    @SuppressWarnings("unchecked")
    public E get(int index){
        if (index < 0 || index > size - 1)
            throw new IndexOutOfBoundsException("删除位置不合法,合法的为0~"+size);
        return  (E) array[index];
    }
    public int size(){
        return  size;
    }

    public String toString (){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < size; i++) builder.append(array[i]).append(" ");
        return  builder.toString();
    }
}
