package com.leetcode.problems;

public class V011ContainerWithMostWater {
    public static int maxAreaLinear(int[] height) {
        int max = 0;
        for (int i = 0, j = height.length - 1; i < j; ) {
            int minHeight = height[i] < height[j] ? height[i++] : height[j--];
            max = Math.max(max, minHeight * (j - i + 1));
        }
        return max;
    }

    public static int maxAreaSquare(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                max = Math.max(max, Math.min(height[i], height[j]) * (j - i));
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
//        int[] height = {1,1};
//        int[] height = {4,3,2,1,4};
//        int[] height = {1, 2, 1};

        System.out.println(maxAreaLinear(height));
    }
}
