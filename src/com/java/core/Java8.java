package com.java.core;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> evenNums = nums.stream().filter(num -> num % 2 == 0).toList();
        System.out.println(evenNums);

        String[] strArr = {"Java", "Python", "Go","C#"};
        List<Integer> strLenArr = Arrays.stream(strArr).map(String::length).toList();
        System.out.println(strLenArr);
        Map<Integer,List<String>> map =  Arrays.stream(strArr).collect(Collectors.groupingBy(String::length));
        map.forEach((k,v) -> System.out.println(k+" "+v ));
    }
}
