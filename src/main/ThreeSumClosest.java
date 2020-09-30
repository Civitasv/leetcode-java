package main;

import java.util.Arrays;

/**
 * 3Sum Closest
 * <p>
 * Given an array nums of n integers and an integer target,
 * find three integers in nums such that the sum is closest to target.
 * Return the sum of the three integers. You may assume that each input would have exactly one solution.
 */
public class ThreeSumClosest {

    public int threeSumClosest(int[] nums, int target) {
        // sum - target
        int diff = Integer.MAX_VALUE;
        int res = 0;
        Arrays.sort(nums);
        if (nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length - 3] <= target) { // 如果最大值小于target，返回最大值的和
            return nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length - 3];
        } else if (nums[0] + nums[1] + nums[2] > target) { // 如果最小值大于target，返回最小值的和
            return nums[0] + nums[1] + nums[2];
        } else { // target值处于之间
            for (int i = 0; i < nums.length - 2; i++) {
                for (int j = i + 1; j < nums.length - 1; j++) {
                    for (int k = j + 1; k < nums.length; k++) {
                        int sum = nums[i] + nums[j] + nums[k];
                        if (Math.abs(sum - target) < diff) {
                            diff = Math.abs(sum - target);
                            res = sum;
                        }
                    }
                }

            }
        }
        return res;
    }

    public int threeSumClosest2(int[] nums, int target) {
        // sum - target
        int diff = Integer.MAX_VALUE;
        Arrays.sort(nums);
        if (nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length - 3] <= target) { // 如果最大值小于target，返回最大值的和
            return nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length - 3];
        } else if (nums[0] + nums[1] + nums[2] > target) { // 如果最小值大于target，返回最小值的和
            return nums[0] + nums[1] + nums[2];
        } else { // target值处于之间
            for (int i = 0; i < nums.length - 2; i++) {
                for (int j = i + 1; j < nums.length - 1; j++) {
                    // 二分查找
                    int cm = target - nums[i] - nums[j];
                    int idx = Arrays.binarySearch(nums, j + 1, nums.length - 1, cm);
                    int hi = idx >= 0 ? idx : ~idx, lo = hi - 1;
                    if (hi < nums.length && Math.abs(cm - nums[hi]) < Math.abs(diff))
                        diff = cm - nums[hi];
                    if (lo > j && Math.abs(cm - nums[lo]) < Math.abs(diff))
                        diff = cm - nums[lo];
                }


            }
        }
        return target - diff;
    }

    // 固定一个，移动两个
    public int threeSumClosest3(int[] nums, int target) {
        int diff = Integer.MAX_VALUE, sz = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < sz && diff != 0; ++i) {
            int lo = i + 1, hi = sz - 1;
            while (lo < hi) {
                int sum = nums[i] + nums[lo] + nums[hi];
                if (Math.abs(target - sum) < Math.abs(diff))
                    diff = target - sum;
                if (sum < target)
                    ++lo;
                else
                    --hi;
            }
        }
        return target - diff;
    }
}
