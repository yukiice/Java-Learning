package com.FuncInterface.Function;

import java.util.Objects;
import java.util.function.Function;

public class Main {
    private  static final Function<Integer,String> INTEGER_STRING_FUNCTION = Objects::toString;
    public static void main(String[] args) {
        Boolean str = INTEGER_STRING_FUNCTION.andThen(String::isEmpty).apply(10);
        System.out.println(str);

        String str1 = INTEGER_STRING_FUNCTION.compose(String::length).apply("你好1");
        System.out.println(str1);
    }
    public static class  Student {

    }
}
