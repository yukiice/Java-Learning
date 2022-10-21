package com.Class.test;

public class Person<T> {
    String name;
    String id ;
    T value;
    public Person(String name,
                      String id,
                      T value){
        this.name = name;
        this.id = id;
        this.value = value;
    }
    public T getValue(){
        return  value;
    }
}
