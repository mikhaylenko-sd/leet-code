package ru.leetcode.tasks.easy;

import java.util.Arrays;

//https://leetcode.com/problems/valid-anagram/
public class ValidAnagram_242 {
    public static void main(String[] args) {
        System.out.println(isAnagram("rat", "car"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] letters1 = s.toCharArray();
        Arrays.sort(letters1);
        char[] letters2 = t.toCharArray();
        Arrays.sort(letters2);

        return Arrays.equals(letters1, letters2);
    }

//    int[] alphabet = new int[26];
//    for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
//    for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
//    for (int i : alphabet) if (i != 0) return false;
//    return true;

}
