package com.java.problems;

public class StringCompression {
    public static void main(String[] args) {
        String s = "aaaaaaaaaa";
        System.out.println(compress(s));
    }
    public static String compress(String s){
        StringBuilder sb = new StringBuilder();
        int size = s.length();
        for(int i=0; i<size;i++){
            char c = s.charAt(i);
            sb.append(c);
            int charCount = 1;
            while(i<size-1 &&s.charAt(i+1) == c){
                i++;
                charCount++;
            }
            sb.append(charCount);
        }
        return sb.toString();
    }
}
