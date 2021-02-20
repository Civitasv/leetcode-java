package main.everyday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 最大整除子集
 */
public class LargestDivisibleSubset {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        if (n == 0) return new ArrayList<>();
        int[] dp = new int[n]; // dp[i]指以nums[i]为结束的最大整除子集的长度
        int max = 0, maxIndex = 0; // 最大整除子集的长度和最后索引
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            int maxSubsetSize = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && maxSubsetSize < dp[j]) {
                    maxSubsetSize = dp[j];
                }
            }
            dp[i] += maxSubsetSize;
            dp[i]++;
            if (dp[i] > max) {
                max = dp[i];
                maxIndex = i;
            }
        }
        List<Integer> ret = new LinkedList<>();
        int currTail = nums[maxIndex], currSize = max;
        for (int i = maxIndex; i >= 0; i--) {
            if (currSize == 0) break;
            if (currTail % nums[i] == 0 && currSize == dp[i]) {
                ret.add(0, nums[i]);
                currTail = nums[i];
                currSize--;
            }
        }
        return ret;
    }
}
