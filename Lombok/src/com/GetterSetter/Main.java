package com.GetterSetter;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1,"yukiice","man");
        student.setName("halo").setSex("woman");
        System.out.println(student.getName());
    }
}
