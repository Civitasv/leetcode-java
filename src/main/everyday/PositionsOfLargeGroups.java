package main.everyday;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 较大分组的位置
 */
public class PositionsOfLargeGroups {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList<>();
        int i = 0;
        while (i < s.length() - 1) {
            int end = i + 1;
            while (end < s.length() && s.charAt(end) == s.charAt(i)) {
                end++;
            }
            if (end - i >= 3) {
                List<Integer> item = new ArrayList<>();
                item.add(i);
                item.add(end - 1);
                res.add(item);
            }
            i = end;
        }
        return res;
    }
}
