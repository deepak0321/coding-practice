package com.java.problems;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {10,20,12,9,39,40,2};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void bubbleSort(int[] nums){
        for(int i =0;i<nums.length - 1;i++){
            boolean swapped = false;
            for(int j = 0;j< nums.length - i - 1;j++){
                if(nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }
}
