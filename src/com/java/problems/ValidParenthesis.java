package com.java.problems;
import java.util.*;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "([)]";
        System.out.println(isValid(s));

    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!stack.isEmpty() && (c == ')' && stack.peek().equals('(') || c == ']' && stack.peek().equals('[') || c == '}' && stack.peek().equals('{')))
                stack.pop();
            else
                stack.push(c);
        }
        return stack.empty();
    }

}
