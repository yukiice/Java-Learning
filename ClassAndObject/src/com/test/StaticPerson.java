package com.test;

public class StaticPerson {
    String name;
    int age;
    String sex;
   public static  String info;

    public static void test(){
//        System.out.println("这是外部非静态"+name);
        System.out.println("这是外部静态变量"+info);
    }

}
