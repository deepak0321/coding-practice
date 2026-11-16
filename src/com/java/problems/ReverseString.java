package com.java.problems;

public class ReverseString {
    public static void main(String[] args) {
        char[] s  = {'K','a','p','e','e','D'};
        reverseString(s);
        System.out.println(String.valueOf(s));
    }

    public static void reverseString(char[] s) {
        for (int left = 0, right = s.length - 1; left < right; left++, right--) {
            char c = s[left];
            s[left] = s[right];
            s[right] = c;
        }
    }
}
