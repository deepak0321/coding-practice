package com.java.core;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsByFirstCharacter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "apple",
                "ant",
                "banana",
                "ball",
                "cat",
                "car"
        );
        Map<Character,List<String>> groups = words.stream().collect(Collectors.groupingBy(s -> s.charAt(0)));
        groups.forEach((k,v) -> System.out.println(k+"->"+v));
    }
}
