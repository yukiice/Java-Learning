package com.Queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue  = new LinkedList<>();
        queue.offer("AAA");
        queue.offer("BBB");
        System.out.println(queue);
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }


//        Deque是双端队列  可以双端操作
        Deque<String> deque =  new LinkedList<>();
        deque.addFirst("000");
        deque.add("222");
        deque.addFirst("333");
        System.out.println(deque);
        while (!deque.isEmpty()){
            System.out.println(deque.pop());
        }


//        栈方法使用
        Queue<Integer> deque1 = new PriorityQueue<>();
        deque1.offer(1);
        deque1.offer(10);
        deque1.offer(3);
        System.out.println(deque1.poll());
        System.out.println(deque1.poll());
        System.out.println(deque1.poll());
    }
}
