package ru.leetcode.tasks.easy;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/contains-duplicate/
public class ContainsDuplicate_217 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> elements = new HashSet<>();
        for (int num : nums) {
            if (elements.contains(num)) {
                return true;
            }
            elements.add(num);
        }
        return false;
    }

//        Map<Integer, Integer> elements = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            elements.put(nums[i], i);
//        }
//        return elements.size() != nums.length;

//        int element = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            for (int j = i; j < nums.length; j++) {
//                if (element == nums[j]) {
//                    return true;
//                }
//            }
//            element = nums[i];
//        }
//        return false;

}


