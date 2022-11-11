package com.JudgeEmptyPackClass;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        test("halo");
        test(null);
        test("hello");
    }

    public static void test(String str){
        Optional.ofNullable(str).ifPresent(s-> System.out.println(s.length()));

//        其他情况
        String s =   Optional.ofNullable(str).orElse("什么啊");
        System.out.println(s);

//        转换

        Integer i = Optional.ofNullable(str).map(String::length).orElse(-1);

    }
}
