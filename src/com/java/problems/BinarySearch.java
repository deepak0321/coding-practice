package com.java.problems;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(binarySearch(nums, 8));
    }

    public static int binarySearch(int[] nums, int num) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == num) return mid;
            else if (nums[mid] < num) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }

}
