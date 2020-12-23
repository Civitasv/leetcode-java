package main;

import java.util.HashSet;
import java.util.Set;

/**
 * 两个数组的交集
 * 给定两个数组，编写一个函数来计算它们的交集。
 */
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }
        for (int num : nums2) {
            if (set.contains(num)) {
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
