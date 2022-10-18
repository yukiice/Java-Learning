package com.binarySearch;

public class Main {
    public static void main(String[] args) {
//        现在有一个从小到大排序的数组，给你一个目标值target，现在我们想要找到这个值在数组中的对应下标，如果数组中没有这个数，请返回-1：
        int[] arr = {1, 3, 4, 6, 7,8, 10, 11, 13, 15};
        System.out.println(search(arr,3));
    }

    public static int search(int[] arr,int target){
        int left = 0, right = arr.length - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            int i = arr[mid];
            if (i<target)
                left = mid +1;
            else if (i > target)
                right = mid - 1;
            else
                return  mid;
        }
        return -1;
    }
}
