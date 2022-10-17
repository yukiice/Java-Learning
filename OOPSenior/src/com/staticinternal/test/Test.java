package com.staticinternal.test;

public class Test {
    private final String name = "外部name";
    public static  class Inner{
        public void test(){
//            System.out.println(name);  // 静态内部类由于是静态的，所以相对外部来说，整个内部类都处于静态上下文（相对外部来说）,是无法访问到外部类的非静态内容的
            System.out.println("静态内部类");
        }
    }
}
