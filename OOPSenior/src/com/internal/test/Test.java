package com.internal.test;

public class Test {
    public static final String name = "外层";
    public static final String title = "标题";
    public void test(){
        System.out.println("外部类的test方法");
    }
    public  class  Inner {
        public String name = "内层";
        public void test(String name){
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(Test.name);
        }
        public void  test01(){
            System.out.println(title);
        }
    }
}
