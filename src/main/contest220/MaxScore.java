package main.contest220;

import java.util.HashMap;
import java.util.Map;

/**
 * 删除子数组的最大得分
 * <p>
 * 给你一个正整数数组 nums ，请你从中删除一个含有 若干不同元素 的子数组。删除子数组的 得分 就是子数组各元素之 和 。
 * <p>
 * 返回 只删除一个 子数组可获得的 最大得分 。
 * <p>
 * 如果数组 b 是数组 a 的一个连续子序列，即如果它等于 a[l],a[l+1],...,a[r] ，那么它就是 a 的一个子数组。
 */
public class MaxScore {
    public int maximumUniqueSubarray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(); // 保存val最近一次出现的index
        int max = nums[0], n = nums.length, i = 0, start = 0;
        while (i < n) {
            int temp = i;
            while (temp < n) {
                if (map.containsKey(nums[temp])) {
                    int index = map.get(nums[temp]);
                    max = Math.max(value(nums, start, temp - 1), max);
                    for (int j = start; j < index; j++)
                        map.remove(nums[j]);
                    map.put(nums[temp], temp);
                    start = index + 1;
                    i = temp + 1;
                    break;
                }
                map.put(nums[temp], temp);
                temp++;
            }
            if (temp >= n) {
                max = Math.max(value(nums, start, temp - 1), max);
            }
        }
        return max;
    }

    private int value(int[] nums, int a, int b) {
        int val = 0;
        for (int i = a; i <= b; i++)
            val += nums[i];
        return val;
    }
}
