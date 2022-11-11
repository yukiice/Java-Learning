package com.Interface;

import com.Interface.test.Test;

public class Main {
    public static void main(String[] args) {
        A<Integer> a  = new A<>();
        System.out.println(a.test(10));
    }

    static class A<T> implements Test<T>{
        @Override
      public  T test(T a){
            return a;
        }
    }
}
