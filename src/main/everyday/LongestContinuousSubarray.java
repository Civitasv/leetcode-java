package main.everyday;

import sun.reflect.generics.tree.Tree;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * 绝对差不超过限制的最长连续子数组
 */
public class LongestContinuousSubarray {
    public int longestSubarray(int[] nums, int limit) {
        int n = nums.length;
        int left = 0, right = 0, maxLen = 0;
        TreeMap<Integer, Integer> map = new TreeMap<>(); // 储存数据出现的个数
        while (right < n) {
            int key = nums[right];
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
            while (map.lastKey() - map.firstKey() > limit) {
                if (map.containsKey(nums[left])) {
                    if (map.get(nums[left]) == 1) {
                        map.remove(nums[left]);
                    } else map.put(nums[left], map.get(nums[left]) - 1);
                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;
    }
}
