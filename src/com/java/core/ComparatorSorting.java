package com.java.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorSorting {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("dinesh", 28, 100000));
        persons.add(new Person("prabakaran", 23, 50000));
        persons.add(new Person("vikram", 24, 14000));
        persons.add(new Person("naveen", 25, 80000));
        persons.add(new Person("nivas", 26, 90000));
        persons.add(new Person("deepak", 24, 28000));

        persons.forEach(System.out::println);

//         Sort By Age - Ascending
//         persons.sort(Comparator.comparingInt(Person::getAge));

//         Sort By Salary - Descending
//        persons.sort(Comparator.comparing(Person::getSalary).reversed());

//        Sort by Salary ascending & Name ascending
//        persons.sort(Comparator.comparing(Person::getSalary).thenComparing(Person::getName).reversed());

//        Sort by Salary descending & age ascending
        persons.sort(Comparator.comparing(Person::getSalary).reversed().thenComparing(Person::getAge));



        System.out.println("-----------------------------------------------");
        persons.forEach(System.out::println);


        String[] strArr = {"c","java","selenium","playwright","rest-assured","jscript","aws"};
        System.out.println("Before Sorting - "+Arrays.toString(strArr));
        System.out.println("-----------------------------------------------");
        // Sort By Last Character
        Arrays.sort(strArr,Comparator.comparing((String s) -> s.charAt(s.length()-1)).thenComparing(String::length));
        //Arrays.sort(strArr,Comparator.comparing(String::length));
        System.out.println("After Sorting - "+Arrays.toString(strArr));

        int[] numArr = {-10, 5,2,10, -2, 7, 1};
        System.out.println(Arrays.toString(numArr));
        System.out.println("-----------------------------------------------");
        Integer[] intArr = Arrays.stream(numArr).boxed().toArray(Integer[]::new);
        //Sort Integers by Absolute Value
        Arrays.sort(intArr,Comparator.comparingInt((Integer x) -> Math.abs(x)).thenComparingInt(Integer::intValue));
        System.out.println(Arrays.toString(intArr));



    }
}

class Person {
    String name;
    int age;
    double salary;

    Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + ", salary=" + salary + '}';
    }
}
