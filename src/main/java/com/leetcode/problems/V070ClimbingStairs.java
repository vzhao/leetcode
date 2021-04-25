package com.leetcode.problems;

public class V070ClimbingStairs {
    public static int climbStairsExponential(int n) {
        if (n <= 2) {
            return n;
        }
        return climbStairsExponential(n - 1) + climbStairsExponential(n - 2);
    }

    public static int climbStairsLinear(int n) {
        if (n == 1) {
            return n;
        }

        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }

        return second;

    }

    public static void main(String[] args) {
        for (int i = 1; i < 40; i++) {
//            System.out.println(climbStairsExponential(i));
            System.out.println(climbStairsLinear(i));
        }
    }
}
