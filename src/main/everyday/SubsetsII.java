package main.everyday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 子集 II
 */
public class SubsetsII {
    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            backTrack(new ArrayList<>(), nums, i);
        }
        return res;
    }

    private void backTrack(List<Integer> item, int[] nums, int start) {
        if (!res.contains(item)) {
            res.add(new ArrayList<>(item));
        }
        // 满足回溯结束条件
        if (start >= nums.length)
            return;
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1])
                continue;
            item.add(nums[i]);
            backTrack(item, nums, i + 1);
            item.remove(item.size() - 1);
        }
    }
}
