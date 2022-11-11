package com.test;

public class StaticOne {
    public static void main(String[] args){
        StaticPerson p1 = new StaticPerson();
        StaticPerson p2 = new StaticPerson();
        p1.info = "halo";
        System.out.println(p2.info);
        p2.test();
    }
}
