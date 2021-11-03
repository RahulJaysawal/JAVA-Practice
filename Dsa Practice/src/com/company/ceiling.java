package com.company;

import java.util.Arrays;

public class ceiling {
    public static void main(String[] args) {
//        int[] arr = {1,3,5,7,9,11};
        int[] arr = {2,3,5,9,14,16,18};
        int target = 19;
//        ceiling(arr , target);
        System.out.println((ceiling(arr , target)));

    }
    static int ceiling(int[] arr , int target){
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]){
                return i;
            }
            else if (arr[i] > target){
                return  i;
            }
        }
        return -1;
    }
}
