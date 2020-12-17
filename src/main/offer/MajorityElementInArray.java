package main.offer;

import java.util.Arrays;

/**
 * 数组中出现次数超过一半的数字
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * <p>
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 */
public class MajorityElementInArray {
    // 排序法
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        return nums[n / 2];
    }

    // 摩尔投票
    public int majority(int[] nums) {
        int x = 0, vote = 0;
        for (int num : nums) {
            if (vote == 0) x = num;
            vote += num == x ? 1 : -1;
        }
        return x;
    }
}
