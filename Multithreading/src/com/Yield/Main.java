package com.Yield;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
           for (int i = 0; i< 50 ; i++){
               if (i % 5 == 0){
                   System.out.println("还行1");
                   Thread.yield();
               }
               System.out.println("t1=="+i);
           }
            System.out.println("1 end");
        });
        Thread t2 = new Thread(()->{
            for (int i = 0; i< 50 ; i++){
                System.out.println("t2=="+i);
            }
            System.out.println("2 end");
        });

        t1.start();
        t2.start();
    }
}
