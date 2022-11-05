package com.Set;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
//        插入元素不允许重复
        set.add("1");
        set.add("2");
//        为了顺序不乱
        Set<Integer> set1  = new LinkedHashSet<>();
        set1.addAll(Arrays.asList(1,3,5,2,7));
        System.out.println(set1);

//        treeset会进行默认的排序  你也可以自定义排序的规则
        Set<Integer> set2 = new TreeSet<>((a,b)->b-a);
        set2.addAll(Arrays.asList(1,3,2,5,7,0));
        System.out.println(set2);
    }
}
