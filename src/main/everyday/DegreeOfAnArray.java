package main.everyday;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DegreeOfAnArray {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int num : nums) {
            if (map.containsKey(num))
                map.put(num, map.get(num) + 1);
            else map.put(num, 1);
            max = Math.max(max, map.get(num));
        }
        int shortest = Integer.MAX_VALUE;
        for (int key : map.keySet()) {
            if (map.get(key) == max) {
                int[] vals = getStartAndEnd(nums, key);
                shortest = Math.min(shortest, vals[1] - vals[0] + 1);
            }
        }
        return shortest;
    }

    private int[] getStartAndEnd(int[] nums, int num) {
        int start = -1, end = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num) {
                if (start == -1) {
                    start = i;
                    end = i;
                } else end = i;
            }
        }
        return new int[]{start, end};
    }
}
