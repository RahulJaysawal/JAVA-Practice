package com.company;

import java.util.Arrays;

public class sorted {
    public static void main(String[] args) {
int[] arr = {5,7,7,8,8,10};
int target = 7;
//int temp =
//        System.out.println(sort(arr , target));
        System.out.println(Arrays.toString(sort(arr , target)));
    }
    static int[] sort(int[] arr , int target){
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]){
                return new int[] {i,i+1};
            }
        }

        return arr;
    }
}
