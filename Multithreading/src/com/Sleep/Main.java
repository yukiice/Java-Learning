package com.Sleep;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            System.out.println("start");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("end");
        });
        thread.start();

//        try {
//            Thread.sleep(3000);
//            thread.resume();
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
    }
}
