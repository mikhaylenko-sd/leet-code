package ru.leetcode.tasks.easy;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
public class RemoveDuplicatesFromSortedArray_26 {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 2, 2, 3, 4, 4, 5, 5, 5};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int prev = -101;
        int prevIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != prev) {
                prev = nums[i];
                prevIndex++;
                nums[prevIndex] = prev;
            }
        }
        for (int j = prevIndex + 1; j < nums.length; j++) {
            nums[j] = -101;
        }
        return prevIndex + 1;
    }
}
