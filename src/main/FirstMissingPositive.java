package main;

import java.util.HashSet;
import java.util.Set;

/**
 * 缺失的第一个正数
 * 给你一个未排序的整数数组，请你找出其中没有出现的最小的正整数
 */
public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int res = 1;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] > 0 && nums[i] <= nums.length && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                res = i + 1;
                break;
            }
        }
        return res;
    }
}
