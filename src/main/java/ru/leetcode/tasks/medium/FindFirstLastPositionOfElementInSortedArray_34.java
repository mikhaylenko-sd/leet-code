package ru.leetcode.tasks.medium;

import java.util.Arrays;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FindFirstLastPositionOfElementInSortedArray_34 {
    public static void main(String[] args) {
        int[] nums = new int[]{5, 7, 7, 8, 8, 10};
        System.out.println(Arrays.toString(searchRange(nums, 8)));

    }

    public static int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int middle = 0;
        int[] result = new int[]{-1, -1};

        if (nums.length == 0) {
            return result;
        }

        while (low <= high) {
            middle = (high - low) / 2 + low;

            if (target < nums[middle]) {
                high = middle - 1;
            } else if (target > nums[middle]) {
                low = middle + 1;
            } else {
                break;
            }
        }

        int copyOfMiddle = middle;

        while (copyOfMiddle >= 0 && nums[copyOfMiddle] == target) {
            result[0] = copyOfMiddle;
            copyOfMiddle--;
        }

        while (middle <= high && nums[middle] == target) {
            result[1] = middle;
            middle++;
        }

        return result;
    }
}

