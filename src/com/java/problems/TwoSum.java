package com.java.problems;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,7,10,24,8,100};
        int target = 11;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> indexMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(indexMap.containsKey(target-nums[i]))
                return new int[]{indexMap.get(target-nums[i]),i};
            indexMap.put(nums[i],i);
        }
        return new int[]{0,0};
    }
}
