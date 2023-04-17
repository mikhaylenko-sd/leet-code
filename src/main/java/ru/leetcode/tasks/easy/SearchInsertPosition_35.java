package ru.leetcode.tasks.easy;

//https://leetcode.com/problems/search-insert-position/
public class SearchInsertPosition_35 {
    public static void main(String[] args) {
        int[] nums = {1, 3};
        System.out.println(searchInsert(nums, 2));
    }

    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int middle = 0;

        if (target > nums[high]) {
            return high + 1;
        }
        if (target < nums[low]) {
            return low;
        }

        while (low <= high) {
            middle = (high - low) / 2 + low;

            if (target < nums[middle]) {
                if (target > nums[middle - 1]) {
                    return middle;
                }
                high = middle - 1;
            } else if (target > nums[middle]) {
                if (target < nums[middle + 1]) {
                    return middle + 1;
                }
                low = middle + 1;
            } else {
                return middle;
            }
        }

        return middle;

//        int low = 0;
//        int high = nums.length - 1;
//        while (low <= high) {
//            int mid = (low + high) / 2;
//            if (nums[mid] == target){
//                return mid;
//            } else if (nums[mid] > target) {
//                high = mid - 1;
//            } else {
//                low = mid + 1;
//            }
//        }
//        return low;
    }


}

