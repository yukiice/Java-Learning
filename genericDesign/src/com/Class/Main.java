package com.Class;

import com.Class.test.Person;

public class Main {
    public static void main(String[] args) {
        Person<String> person  =  new Person<String>("yukiice","10","halo");
        Person<Integer> p2  =  new Person<Integer>("yukiice","10",10);
        System.out.println(person.getValue());
        System.out.println(p2.getValue());
    }
}
