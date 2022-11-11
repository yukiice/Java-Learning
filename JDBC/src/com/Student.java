package com;

public class Student {
    Integer id;
    String name;
    Student(Integer id,String name){
        this.name = name;
        this.id = id;
    }

    public  void  getMsg(){
        System.out.println("my name is "+name);
    }
}
