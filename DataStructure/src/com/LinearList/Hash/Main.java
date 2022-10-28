package com.LinearList.Hash;

import com.LinearList.Hash.Test.Person;

public class Main<E> {
    public static void main(String[] args) {
        Person<Integer> p1 = new Person<>();
//        String str = "AAA";
//        System.out.println(p1.contains(str));
//        p1.insert(str);
//        System.out.println(p1.contains(str));
        for (int i=0;i < 100;i++)
            p1.insert(i);

        System.out.println(p1);
    }
}
