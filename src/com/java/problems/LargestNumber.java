package com.java.problems;
import java.util.*;
public class LargestNumber {
    public static void main(String[] args) {
        int[] nums ={ 10, 2};
        System.out.println(largestNumber(nums));
    }
    public static String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        for(int i=0;i<arr.length;i++){
            arr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(arr,(a,b) -> (b+a).compareTo(a+b));

        if(arr[0].equals("0")) return "0";
        StringBuilder sb = new StringBuilder();
        for(String num: arr){
            sb.append(String.valueOf(num));
        }
        return sb.toString();
    }
}
