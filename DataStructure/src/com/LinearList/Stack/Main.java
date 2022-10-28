package com.LinearList.Stack;

import com.LinearList.Stack.InOut.Link;

public class Main {
    public static void main(String[] args) {
        Link<Integer> link = new Link<>();
        link.add(10);
        link.add(20);
        link.add(30);
//        这里反的是删除的元素
        System.out.println(link.pop());
        System.out.println(link.pop());
        System.out.println(link.pop());

    }
}
