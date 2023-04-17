package ru.leetcode.tasks.easy;

//https://leetcode.com/problems/sqrtx/
public class SqrtX_69 {
    public static void main(String[] args) {
        int x=50000;
        int y=x*x;
        System.out.println(y);
        System.out.println(mySqrt(788543));
    }

    public static int mySqrt(int x) {
        int low = 0;
        int high = x;
        while (low <= high) {
            long middle = (high - low) / 2 + low;

            if (middle * middle == x) {
                return (int) middle;
            } else if (x < middle * middle) {
                high =(int) middle - 1;
            } else {
                low =(int) middle + 1;
            }
        }
        return low-1;
    }
}
