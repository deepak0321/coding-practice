package com.java.core;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaceWithStreams {

    public static void main(String[] args) {

        List<String> list = List.of("Deepak", "Naveen", "Ajith", "Ranjith","Prabakaran","Arjun","Sarvan");

        list.stream()
                .filter(s -> s.length()>6)
                .map(String::toUpperCase)
                .sorted((a,b) -> a.length() - b.length())
                .forEach(System.out::println);



    }
}
