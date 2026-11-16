package com.java.problems;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,1};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while(mid <= high){
            if(nums[mid]==0){
                int temp = nums[low];
                nums[low++] = nums[mid];
                nums[mid++] = temp;
            } else if(nums[mid]==1){
                mid++;
            }else{
                int temp = nums[high];
                nums[high--] = nums[mid];
                nums[mid] = temp;
            }
        }
    }
}
