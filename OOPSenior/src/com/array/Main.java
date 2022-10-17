package com.array;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[0] = 0;
        System.out.println(array.length);
        System.out.println(array[0]);

        int[]a = {1,2,3,4,5};
        int[]b = {1,2,3,4,5};
        System.out.println(equals(a,b));
        test("halo","什么啊");
    }

    private static boolean equals(int[] a,int[] b){
        int[] newArr = new int[a.length];
        for (int i:newArr){
            if (a[i] != b[i]) return  false;
        }
        return  true;
    }

    private static void test(String... strings){
        for (String name : strings){
            System.out.println(name);
        }
    }
}
