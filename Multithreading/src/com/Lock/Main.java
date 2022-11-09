package com.Lock;

public class Main {
    public static int value = 0;
    public static void main(String[] args) throws InterruptedException {
        Main main1 = new Main();
        Main main2 = new Main();
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 100000; i++) {
                synchronized (main1){
                    value++;
                }
            }
        });

        Thread t2 = new Thread(()->{
            for (int i = 0; i < 100000; i++) {
                synchronized (main2){
                    value++;
                }
            }
        });

        t1.start();
        t2.start();
        Thread.sleep(1000);
        System.out.println(value);

    }
}
