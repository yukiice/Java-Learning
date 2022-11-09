package com.Thread;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i = 0; i < 100;i++){
                    sum += i;
                }
                System.out.println(sum);
            }
        });
        thread.start();

        new Thread(()->{
            for (int i = 0; i < 40; i++) {
                System.out.println("我是一号线程"+i);
                if (i == 30)
                    Thread.currentThread().stop();
            }
        }).start();
    }
}
