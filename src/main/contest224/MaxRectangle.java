package main.contest224;

import java.util.*;

/**
 * 可以形成最大正方形的矩形数目
 */
public class MaxRectangle {
    public int countGoodRectangles(int[][] rectangles) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] rectangle : rectangles) {
            int a = Math.min(rectangle[0], rectangle[1]);
            if (map.containsKey(a))
                map.put(a, map.get(a) + 1);
            else map.put(a, 1);
        }
        int maxLen = 0;
        for (int key : map.keySet()) {
            maxLen = Math.max(maxLen, key);
        }
        return map.get(maxLen);
    }
}
