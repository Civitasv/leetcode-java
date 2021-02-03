package main;

import java.util.*;

/**
 * 滑动窗口中位数
 */
public class SlidingWindowMedian {
    public double[] medianSlidingWindow(int[] nums, int k) {
        double[] res = new double[nums.length - k + 1];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < k; i++)
            insert(list, nums[i]);
        res[0] = mid(list);
        for (int i = k; i < nums.length; i++) {
            pop(list, nums[i - k]);
            insert(list, nums[i]);
            res[i - k + 1] = mid(list);
        }
        return res;
    }

    /**
     * 将val插入到list中，维护list单调递增
     *
     * @param list 有序数组
     * @param val  待插入的数据
     */
    private void insert(List<Integer> list, int val) {
        // 如果list为空
        if (list.isEmpty()) {
            list.add(val);
            return;
        }
        // 如果val大于list的最后一个元素
        if (val >= list.get(list.size() - 1)) {
            list.add(val);
            return;
        }
        // 如果val小于list的第一个元素
        if (val <= list.get(0)) {
            list.add(0, val);
            return;
        }
        // 二分法获取val所在的索引
        int lo = 0, hi = list.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int ele = list.get(mid);
            if (ele > val) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        list.add(lo, val);
    }

    /**
     * 将val从list删除，维护list单调递增
     *
     * @param list 有序数组
     * @param val  待删除的数据
     */
    private void pop(List<Integer> list, int val) {
        // 二分法获取val的索引
        int lo = 0, hi = list.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int ele = list.get(mid);
            if (ele >= val) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        list.remove(lo);
    }

    /**
     * 获取中位数
     *
     * @param list 有序数组
     * @return 中位数
     */
    private double mid(List<Integer> list) {
        return list.size() % 2 == 1 ? list.get(list.size() / 2) : ((double) list.get(list.size() / 2 - 1) + list.get(list.size() / 2)) / 2.0;
    }
}
