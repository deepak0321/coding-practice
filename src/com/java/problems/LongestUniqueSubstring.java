package com.java.problems;
import java.util.*;

public class LongestUniqueSubstring {
    public static void main(String[] args) {
        String s = "!S``PW";
        System.out.println(lengthOfLongestSubstring(s));

    }
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int left = 0;
        int longest = 0;
        for(int right =0; right<s.length();right++){
            char c = s.charAt(right);
            while(seen.contains(c)){
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(c);
            longest = Math.max(longest,right - left + 1);
        }
        return longest;
    }
}
