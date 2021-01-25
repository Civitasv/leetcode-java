package main;

/**
 * 所有奇数长度子数组的和
 * <p>
 * 给你一个正整数数组 arr ，请你计算所有可能的奇数长度子数组的和。
 * <p>
 * 子数组 定义为原数组中的一个连续子序列。
 * <p>
 * 请你返回 arr 中 所有奇数长度子数组的和 。
 */
public class SumOfAllOddLengthSubarrays {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int i = 1; i <= arr.length; i += 2) {
            for (int j = 0; j < arr.length - i + 1; j++) {
                for (int k = 0; k < i; k++) {
                    sum += arr[j + k];
                }
            }
        }
        return sum;
    }
}
