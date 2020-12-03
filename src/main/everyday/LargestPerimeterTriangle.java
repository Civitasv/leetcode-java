package main.everyday;

import java.util.Arrays;

/**
 * 给定由一些正数（代表长度）组成的数组 A，返回由其中三个长度组成的、面积不为零的三角形的最大周长。
 * <p>
 * 如果不能形成任何面积不为零的三角形，返回 0。
 */
public class LargestPerimeterTriangle {
    public int largestPerimeter(int[] A) {
        if (A.length < 3)
            return 0;
        int max = 0;
        Arrays.sort(A);
        for (int i = 0; i < A.length - 2; i++) {
            int a = A[i], b = A[i + 1], c = A[i + 2];
            if (isPerimeterTriangle(a, b, c)) {
                max = Math.max(max, a + b + c);
            }
        }
        return max;
    }

    public boolean isPerimeterTriangle(int a, int b, int c) {
        return a + b > c;
    }
}
