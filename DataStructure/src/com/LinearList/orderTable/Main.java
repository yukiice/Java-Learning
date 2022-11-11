package com.LinearList.orderTable;

import com.LinearList.orderTable.collection.ArrayList;

public class Main {
    public static void main(String[] args) {
//
        ArrayList<String> list = new ArrayList<>();
        for (int i=0;i<30;i++)
            list.add("a"+i,i);
        System.out.println(list);
//        System.out.println(list.remove(-1));
        System.out.println(list.remove(2));
        System.out.println(list.get(10));
    }
}
