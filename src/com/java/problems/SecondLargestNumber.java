package com.java.problems;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] arr = {12,35,1,10,34,2};
        System.out.println(getSecondLargest(arr));
    }

    public static int getSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                secMax = max;
                max = num;
            } else if (num > secMax && num != max) secMax = num;
        }
        if (secMax == Integer.MIN_VALUE) return -1;
        return secMax;

    }

}
