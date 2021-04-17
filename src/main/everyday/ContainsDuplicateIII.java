package main.everyday;

import java.util.*;
import java.util.function.Consumer;

public class ContainsDuplicateIII {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        Map<Integer, Long> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
            map.put(i, (long) nums[i]);
        List<Map.Entry<Integer, Long>> list = new ArrayList<>(map.entrySet());
        list.sort((o1, o2) -> (int) (o1.getValue() - o2.getValue()));
        for (int i = 0; i < list.size() - 1; i++) {
            Map.Entry<Integer, Long> first = list.get(i);
            int temp = i + 1;
            while (temp < list.size() && Math.abs(first.getValue() - list.get(temp).getValue()) <= t) {
                if (Math.abs(first.getKey() - list.get(temp).getKey()) <= k)
                    return true;
                temp++;
            }
        }
        return false;
    }
}
