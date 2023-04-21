package ru.leetcode.tasks.easy;

//https://leetcode.com/problems/valid-palindrome/
public class ValidPalindrome_125 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (Character.isLetterOrDigit(s.charAt(start)) && Character.isLetterOrDigit(s.charAt(end))) {
                if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                    return false;
                }
                start++;
                end--;
            }

            if (!Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }
            if (!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }
        }

        return true;


//            while (!Character.isLetterOrDigit(s.charAt(start)) && start<end) {
//                start++;
//            }
//            while (!Character.isLetterOrDigit(s.charAt(end)) && start<end) {
//                end--;
//            }
//            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
//                return false;
//            }
//            start++;
//            end--;
//        }
//        return true;

//        s = s.toLowerCase();
//        StringBuilder sb = new StringBuilder();
//        StringBuilder sbReversed = new StringBuilder();
//
//        for (int i = 0; i < s.length(); i++) {
//            if (Character.isLetterOrDigit(s.charAt(i))) {
//                sb.append(s.charAt(i));
//            }
//        }
//        for (int i = s.length() - 1; i >= 0; i--) {
//            if (Character.isLetterOrDigit(s.charAt(i))) {
//                sbReversed.append(s.charAt(i));
//            }
//        }
//        return sb.toString().equals(sbReversed.toString());
    }
}
