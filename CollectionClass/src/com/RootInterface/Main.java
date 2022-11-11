package com.RootInterface;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(0,"A");
        list.add(0,"B");
        System.out.println(list);
        ArrayList<String> list2 = new ArrayList<>();
        list2.add(0,"C");
        System.out.println(list.removeAll(list2));
    }
}
