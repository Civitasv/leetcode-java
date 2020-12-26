package main;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;

/**
 * 最大矩形
 * 给定一个仅包含 0 和 1 、大小为 rows x cols 的二维二进制矩阵，找出只包含 1 的最大矩形，并返回其面积。
 */
public class MaximalRectangle {
    public int maximalRectangle(char[][] matrix) {
        int rows = matrix.length;
        if (rows == 0)
            return 0;
        int cols = matrix[0].length;
        int[] heights = new int[cols]; // 每一行
        int ans = 0;
        for (char[] chars : matrix) {
            for (int j = 0; j < cols; j++) {
                if (chars[j] == '1')
                    heights[j] += 1;
                else heights[j] = 0;
            }
            ans = Math.max(ans, max(heights));
        }
        return ans;
    }

    private int max(int[] heights) {
        int res = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        int[] new_heights = new int[heights.length + 2];
        for (int i = 1; i < heights.length + 1; i++) {
            new_heights[i] = heights[i - 1];
        }
        for (int i = 0; i < new_heights.length; i++) {
            while (!stack.isEmpty() && new_heights[stack.peek()] > new_heights[i]) {
                int cur = stack.pop();
                res = Math.max(res, (i - stack.peek() - 1) * new_heights[cur]);
            }
            stack.push(i);
        }
        return res;
    }
}
