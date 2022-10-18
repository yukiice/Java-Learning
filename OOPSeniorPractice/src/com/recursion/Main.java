package com.recursion;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 7,8, 10, 11, 13, 15};
        System.out.println(binarySearch(arr,0,arr.length-1,3));
    }

    public static  int binarySearch(int[] arr,int left,int right,int target){
        if (left > right) return  -1;
        int mid = (left + right ) / 2;
        if (arr[mid] > target)
            return binarySearch(arr,left,mid - 1,target);
        else if (arr[mid] < target)
            return binarySearch(arr,mid + 1,right,target);
        else
            return mid;
    }
}
