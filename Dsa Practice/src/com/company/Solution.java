package com.company;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        String sequence = "ababc";
        String word = "ab";
       System.out.println((maxRepeating(sequence,word)));
    }
    static int maxRepeating(String sequence, String word) {
        int count=0;
        String temp = word;
        while(sequence.contains(temp)){
            count++;
            temp = temp + word;
        }

        return count;
    }
}