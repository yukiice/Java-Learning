package com.Function;

public class Main {
    public static void main(String[] args) {
        Integer a = test(6);
        System.out.println(a);

//        非静态
        Main main = new Main();
        System.out.println(main.test02(66));
    }

    public static  <T> T test(T t){
        return  t;
    }

//    非静态方法
    public <T> T test02(T t){
        return  t;
    }
}
