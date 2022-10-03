package com.Enum;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setStatus(Enum.GO);
        System.out.println(p1.getStatus());
    }
}
