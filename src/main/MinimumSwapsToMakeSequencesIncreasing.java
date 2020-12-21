package main;

import java.util.Arrays;

/**
 * 使序列递增的最小交换次数
 * 我们有两个长度相等且不为空的整型数组A和B。
 * <p>
 * 我们可以交换A[i]和B[i]的元素。注意这两个元素在各自的序列中应该处于相同的位置。
 * <p>
 * 在交换过一些元素之后，数组 A 和 B 都应该是严格递增的（数组严格递增的条件仅为A[0] < A[1] < A[2] < ... < A[A.length - 1]）。
 * <p>
 * 给定数组 A 和 B，请返回使得两个数组均保持严格递增状态的最小交换次数。假设给定的输入总是有效的。
 */
public class MinimumSwapsToMakeSequencesIncreasing {
    public int minSwap(int[] A, int[] B) {
        int n = A.length;
        int[][] dp = new int[n][2]; // dp[i][1] 表示 A[i] B[i] 被交换最小值 dp[i][0] 表示 A[i] B[i] 不交换最小值
        for (int[] inner : dp) {
            Arrays.fill(inner, Integer.MAX_VALUE);
        }
        dp[0][0] = 0;
        dp[0][1] = 1;
        for (int i = 1; i < n; i++) {
            if (A[i - 1] < A[i] && B[i - 1] < B[i]) { // A[i] B[i] 不需要交换
                // 如果不换
                dp[i][0] = Math.min(dp[i][0], dp[i - 1][0]);
                // 如果换，i-1必须换
                dp[i][1] = Math.min(dp[i][1], dp[i - 1][1] + 1);
            }
            if (B[i - 1] < A[i] && A[i - 1] < B[i]) { // 说明也可以交换
                // 如果上一位交换，那么当前不交换
                dp[i][0] = Math.min(dp[i][0], dp[i - 1][1]);
                // 如果上一位不交换，那么当前交换
                dp[i][1] = Math.min(dp[i][1], dp[i - 1][0] + 1);
            }

        }
        return Math.min(dp[n - 1][0], dp[n - 1][1]);
    }
}
