package com.List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("AAA");
        System.out.println(list.get(0));

        List<Integer> list2 =new ArrayList<>();
        list2.add(10);
        System.out.println(list2);
        list2.remove((Integer) 10);
        System.out.println(list2);

    }
}
