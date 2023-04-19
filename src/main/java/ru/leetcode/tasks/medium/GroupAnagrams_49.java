package ru.leetcode.tasks.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/group-anagrams/
public class GroupAnagrams_49 {
    public static void main(String[] args) {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupAnagrams = new HashMap<>();
        for (String str : strs) {

            char[] letters = str.toCharArray();
            Arrays.sort(letters);
            String key = String.valueOf(letters);
            List<String> value = new ArrayList<>();

            if (groupAnagrams.containsKey(key)) {
                value = groupAnagrams.get(key);
            }

            value.add(str);
            groupAnagrams.put(key, value);
        }

        return new ArrayList<>(groupAnagrams.values());
    }

//    public static List<List<String>> groupAnagrams(String[] strs) {
//        List<List<String>> anagrams = new ArrayList<>();
//        List<Integer> repeats = new ArrayList<>();
//
//        for (int i = 0; i < strs.length; i++) {
//            if (!repeats.contains(i)) {
//
//                List<String> anagram = new ArrayList<>();
//                anagram.add(strs[i]);
//                for (int j = i + 1; j < strs.length; j++) {
//                    if (isAnagram(strs[i], strs[j])) {
//                        anagram.add(strs[j]);
//                        repeats.add(j);
//                    }
//                }
//                anagrams.add(anagram);
//
//            }
//        }
//
//        return anagrams;
//    }
//
//    private static boolean isAnagram(String s1, String s2) {
//        if (s1.length() != s2.length()) {
//            return false;
//        }
//        int[] alphabet = new int[26];
//        for (int i = 0; i < s1.length(); i++) {
//            alphabet[s1.charAt(i) - 'a']++;
//            alphabet[s2.charAt(i) - 'a']--;
//        }
//
//        for (int letterCount : alphabet) {
//            if (letterCount != 0) {
//                return false;
//            }
//        }
//
//        return true;
//    }
}
