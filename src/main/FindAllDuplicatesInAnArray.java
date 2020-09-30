package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicatesInAnArray {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        List<Integer> dls = new ArrayList<>();
        int lo = 0, hi = nums.length;
        while (lo < hi - 1) {
            if (nums[lo] == nums[lo + 1]) {
                dls.add(nums[lo]);
                lo++;
            }
            lo++;
        }
        return dls;
    }

    public List<Integer> findDuplicates2(int[] nums) {
        List<Integer> dls = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int val = Math.abs(nums[i]);
            if (nums[n - val] < 0)
                dls.add(val);
            nums[n - val] = -nums[n - val];
        }
        return dls;
    }
}
