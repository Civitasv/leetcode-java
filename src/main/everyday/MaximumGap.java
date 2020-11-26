package main.everyday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 最大间距
 * 给定一个无序的数组，找出数组在排序之后，相邻元素之间最大的差值。
 * <p>
 * 如果数组元素个数小于 2，则返回 0。
 */
public class MaximumGap {
    public int maximumGap(int[] nums) {
        if (nums.length < 2)
            return 0;
        int gap = Integer.MIN_VALUE, min = nums[0], max = nums[0];
        for (int num : nums) {
            min = Math.min(num, min);
            max = Math.max(num, max);
        }
        if (min == max)
            return 0;
        List<List<Integer>> buckets = bucketSort(nums, min, max);
        int prevMax = Integer.MIN_VALUE;
        for (List<Integer> bucket : buckets) {
            if (bucket.size() != 0 && prevMax != Integer.MIN_VALUE) {
                gap = Math.max(bucket.get(0) - prevMax, gap);
            }
            if (bucket.size() != 0) {
                prevMax = bucket.get(bucket.size() - 1);
            }
        }
        return gap;
    }

    // 桶排序
    public List<List<Integer>> bucketSort(int[] nums, int min, int max) {
        if (nums == null)
            return null;
        int n = nums.length;
        // 向上取整
        int per = (int) Math.ceil((double) (max - min) / (n - 1));
        int bucketNum = (int) Math.ceil((double) (max - min) / per + 1);
        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i < bucketNum; i++) {
            buckets.add(new ArrayList<>());
        }
        for (int num : nums) {
            buckets.get(index(num, per, min)).add(num);
        }
        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }
        return buckets;
    }

    public int index(int a, int per, int min) {
        return (a - min) / per;
    }
}
