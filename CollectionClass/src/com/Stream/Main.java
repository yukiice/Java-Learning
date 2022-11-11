package com.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
       list = list
               .stream()
               .map(e -> e+1)
                .collect(Collectors.toList());
        System.out.println(list);


        Random random = new Random();
        random.ints(-100,10)
                .limit(10)
                .filter(i -> i < 0)
                .sorted()
                .forEach(System.out::println);
    }
}
