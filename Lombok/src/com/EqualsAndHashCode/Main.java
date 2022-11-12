package com.EqualsAndHashCode;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        label:
        for (int i=0;i<10;i++){
            System.out.println("外层"+i);
            for (int j = 0; j < 10; j++) {
                System.out.println(j);
                if (j == 1) continue label;
            }
        }
        System.out.println(student);
    }
}
