package com.string;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World".length());
        String str = new String("hello world");
        String[] sub = str.split(" ");
        for (String name:sub){
            System.out.println(name);
        }

//
        String char1 = new String("hello world");
        char[] chars = char1.toCharArray();
        System.out.println(chars);
    }
}
