package com.packageclass;
public class Main {
    public static void main(String[] args) {
        Integer i = new Integer("666");
        Integer i2 = Integer.valueOf("666");
        System.out.println(i2 == 666);
        System.out.println(i == 666);
    }
}
