package com.java.problems;
import java.util.*;

public class RemoveDuplicateLetters {
    public static void main(String[] args) {
        String s = "bcabc";
        System.out.println(removeDuplicateLetters(s));
    }
    public static String removeDuplicateLetters(String s) {

        StringBuilder result = new StringBuilder();
        int[] freq = new int[26];
        boolean[] seen = new boolean[26];
        Deque<Character> stack = new ArrayDeque<>();
        for(char c: s.toCharArray())
            freq[c - 'a']++;
        for(char c: s.toCharArray()){
            freq[c - 'a']--;
            if(seen[c - 'a'])
                continue;
            while(!stack.isEmpty() && stack.peek() > c && freq[stack.peek() - 'a'] > 0){
                seen[stack.pop() - 'a'] = false;
            }
            stack.push(c);
            seen[c - 'a'] = true;
        }
        while(!stack.isEmpty()){
            result.append(stack.removeLast());
        }
        return result.toString();
    }
}
