package ru.leetcode.tasks.easy;

import java.util.Arrays;

//https://leetcode.com/problems/two-sum/
public class TwoSum_1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int firstElement = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (firstElement + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }


}
