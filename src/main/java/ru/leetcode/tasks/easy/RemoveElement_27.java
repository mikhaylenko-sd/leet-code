package ru.leetcode.tasks.easy;

//https://leetcode.com/problems/remove-element/
public class RemoveElement_27 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(removeElement(nums, 2));
    }

    public static int removeElement(int[] nums, int val) {
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                index++;
                nums[index] = nums[i];
            }
        }
//        for (int j = index + 1; j < nums.length; j++) {
//            nums[j] = -101;
//        }
        return index + 1;
    }
}
