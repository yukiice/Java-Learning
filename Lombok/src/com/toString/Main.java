package com.toString;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("yukiice");
        student.setId(1);
        student.setSex("man");
        System.out.println(student.toString());
    }
}
