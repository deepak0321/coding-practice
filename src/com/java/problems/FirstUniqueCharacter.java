package com.java.problems;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String s = "array";
        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;
    }
}
