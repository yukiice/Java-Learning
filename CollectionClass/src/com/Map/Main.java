package com.Map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap();
        map.put(1,"花花");
        map.put(2,"yukiice");
        System.out.println(map);
        System.out.println(map.get(1));
//        java8新增  当不存在的时候  返回一个默认的值
        System.out.println(map.getOrDefault(3, "备胎"));
    }
}
