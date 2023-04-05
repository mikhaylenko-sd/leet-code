package ru.leetcode.tasks.easy;

//https://leetcode.com/problems/palindrome-number/
public class PalindromeNumber_9 {
    public static void main(String[] args) {
        System.out.println(
                isPalindrome(-121) + "\n" +
                        isPalindrome(10) + "\n" +
                        isPalindrome(0) + "\n" +
                        isPalindrome(121)
        );
    }

    public static boolean isPalindrome(int x) {
        int copyX = x;
        int reversedX = 0;
        if (x < 0 || x != 0 && x % 10 == 0) {
            return false;
        }
        while (x != 0) {
            reversedX = reversedX * 10 + x % 10;
            x = x / 10;
        }
        return reversedX == copyX;
    }
}
