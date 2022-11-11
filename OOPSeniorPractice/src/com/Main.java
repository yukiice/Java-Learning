package com;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 7, 2, 9, 0, 6, 1, 8, 4};
        int time = 10;
        for (int a = 0;a < arr.length;a++){
            time++;
            boolean flag = false;
            for (int b = 0; b < arr.length - a -1; b ++){
                if (arr[b] > arr[b+1]){
                    int mid = arr[b+1];
                    arr[b+1] = arr[b];
                    arr[b] = mid;
                    flag = true;
                }
            }
            System.out.println(time);
            System.out.println(Arrays.toString(arr));
            if (!flag) break;
        }
        System.out.println(Arrays.toString(arr));
    }
}
