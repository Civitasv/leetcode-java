package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 全排列 II
 * 给定一个可包含重复数字的序列 nums ，按任意顺序 返回所有不重复的全排列。
 */
public class PermutationsII {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        permuteUnique(res, new ArrayList<>(), nums, new boolean[nums.length]);
        return res;
    }

    private void permuteUnique(List<List<Integer>> res, List<Integer> item, int[] nums, boolean[] visited) {
        if (item.size() == nums.length) {
            res.add(new ArrayList<>(item));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i] || (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]))
                continue;
            visited[i] = true;
            item.add(nums[i]);
            permuteUnique(res, item, nums, visited);
            visited[i] = false;
            item.remove(item.size() - 1);
        }
    }
}
