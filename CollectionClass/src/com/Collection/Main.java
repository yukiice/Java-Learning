package com.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list  = new ArrayList<>();

        for (int i = 0;  i<10;i++)
            list.add(i);
        System.out.println(list);
        System.out.println(Collections.max(list));

//        二分搜索
        System.out.println(Collections.binarySearch(list,3));

//        覆盖
        Collections.fill(list,5);
        System.out.println(list);

//        快速生成一个空集合
        List<Integer> list1 = Collections.emptyList();
        System.out.println(list1);
    }
}
