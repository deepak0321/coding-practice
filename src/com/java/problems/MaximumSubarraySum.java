package com.java.problems;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[] nums = {-5,-4,1,-7,8};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {

        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            currentSum += nums[i];

            if(currentSum > maxSum)
                maxSum = currentSum;

            if(currentSum < 0)
                currentSum = 0;
        }
        return maxSum;
    }
}
