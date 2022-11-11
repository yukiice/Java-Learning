package com.FuncInterface.Consumer;

import java.util.function.Consumer;

public class Main {
    private  static  final  Consumer<Student> STUDENT_CONSUMER = student -> System.out.println("味道还行");
    public static void main(String[] args) {
        Student student = new Student();
        STUDENT_CONSUMER.accept(student);

        STUDENT_CONSUMER.andThen(student1 -> System.out.println("什么"))
                .andThen(student1 -> System.out.println("什么2"))
                .accept(student);
    }
    public static class Student {
    }
}
