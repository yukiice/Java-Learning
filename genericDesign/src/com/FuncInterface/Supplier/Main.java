package com.FuncInterface.Supplier;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<Student> studentSupplier = Student::new;
        studentSupplier.get().hello();
    }
    public static class Student{
        public  void hello(){
            System.out.println("我是学生");
        }
    }
}
