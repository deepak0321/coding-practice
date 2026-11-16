package com.java.problems;

public class StringToInteger {
    public static void main(String[] args) {
        String s = "291493";
        System.out.println(stringToInt(s));
    }

    public static long stringToInt(String s){
        long num = 0;
        for(char c: s.toCharArray()){
            num = num*10 + (c - '0');
        }
        return num;
    }
}
