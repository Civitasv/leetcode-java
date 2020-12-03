package main.everyday;

import main.structure.BIT;

import java.util.*;

/**
 * Given an array nums, we call (i, j) an important reverse pair if i < j and nums[i] > 2*nums[j].
 * <p>
 * You need to return the number of important reverse pairs in the given array.
 */
public class ReversePairs {
    public int reversePairs(int[] nums) {
        int res = 0, n = nums.length;
        int[] copy = Arrays.copyOf(nums, n);
        BIT bit = new BIT(n);

        Arrays.sort(copy);

        for (int i = 0; i < n; i++) {
            int ele = nums[i];
            int b = bit.query(index(copy, 2L * ele + 1) - 1);
            res += i - b;
            bit.update(1, index(copy, ele));
        }

        return res;
    }

    private int index(int[] arr, long val) {
        int l = 0, r = arr.length - 1, m;

        while (l <= r) {
            m = l + ((r - l) >> 1);

            if (arr[m] >= val) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }

        return l + 1;
    }
}


