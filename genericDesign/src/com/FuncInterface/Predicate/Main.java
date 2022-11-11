package com.FuncInterface.Predicate;

import java.util.function.Predicate;

public class Main {
    private static final Predicate<Student> STUDENT_PREDICATE = student -> student.score >= 60;
    public static void main(String[] args) {
        Student student =  new Student();
        student.score = 80;
        System.out.println(STUDENT_PREDICATE.test(student));

//        还可以联合判断
        System.out.println(STUDENT_PREDICATE.and(student1 -> student1.score >= 90).test(student));
        student.score = 95;
        System.out.println(STUDENT_PREDICATE.and(student1 -> student1.score >= 90).test(student));


//       该类型同时提供了一个对应的实现，来判断两个对象是否相等
        Predicate<String>  predicate = Predicate.isEqual("hello world");
        System.out.println(predicate.test("hello world"));
        System.out.println(predicate.test("hallo"));
    }
    public static class Student {
        public  int score;
    }
}
