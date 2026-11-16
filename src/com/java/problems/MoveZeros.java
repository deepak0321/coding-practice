package com.java.problems;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {45192,0,-659,-52359,-99225,-75991,0,-15155,27382,59818,0,-30645,-17025,81209,887,64648};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void moveZeroes(int[] nums) {
        int zeroIndex = 0;
        int numIndex = 0;
        int length = nums.length - 1 ;
        while(zeroIndex < length && numIndex < length){
            if(nums[zeroIndex]!=0 && zeroIndex < length && numIndex < length) {
                zeroIndex++;
                numIndex++;
            }
            if(nums[numIndex]==0 && zeroIndex < length && numIndex < length){
                numIndex++;
            }
            if(nums[zeroIndex] == 0 && nums[numIndex]!=0){
                nums[zeroIndex] = nums[numIndex];
                nums[numIndex] = 0;
            }
        }

    }
}
