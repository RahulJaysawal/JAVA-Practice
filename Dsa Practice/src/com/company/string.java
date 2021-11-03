package com.company;

public class string {
    public static void main(String[] args) {
        String st = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            System.out.println(ch);
            st = st + ch;
        }
        System.out.println(st);
    }
}
