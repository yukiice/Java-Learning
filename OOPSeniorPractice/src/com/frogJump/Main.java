package com.frogJump;

public class Main {
    public static void main(String[] args) {
        System.out.println(jump(2));
    }

    public  static  int jump(int number){
        int[] arr = new  int[number+1];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2;i<=number;i++)
            arr[i] = arr[i-1] + arr[i-2];
        return arr[number];
    }
}
