package main.everyday;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DegreeOfAnArray {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, int[]> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.containsKey(num)) {
                int[] vals = map.get(num);
                vals[0]++;
                vals[2] = i;
            } else {
                map.put(num, new int[]{1, i, i});
            }
            max = Math.max(max, map.get(num)[0]);
        }
        int shortest = Integer.MAX_VALUE;
        for (int key : map.keySet()) {
            int[] vals = map.get(key);
            if (vals[0] == max) {
                shortest = Math.min(shortest, vals[2] - vals[1] + 1);
            }
        }
        return shortest;
    }
}
