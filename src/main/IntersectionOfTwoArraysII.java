package main;

import java.util.*;

/**
 * 两个数组的交集 II
 * 给定两个数组，编写一个函数来计算它们的交集。
 */
public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>(); // val -- num
        List<Integer> res = new ArrayList<>();
        for (int num : nums1) {
            if (map.containsKey(num)) {
                int val = map.get(num);
                map.put(num, val + 1);
            } else map.put(num, 1);
        }
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                map.put(num, map.get(num) - 1);
                res.add(num);
            }
        }
        int[] result = new int[res.size()];
        int i = 0;
        for (int num : res) {
            result[i++] = num;
        }
        return result;
    }
}
