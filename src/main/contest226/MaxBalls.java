package main.contest226;

import java.util.*;

/**
 * 盒子中小球的最大数量
 */
public class MaxBalls {
    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = lowLimit; i <= highLimit; i++) {
            int key = getIndex(i);
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else map.put(key, 1);
        }
        int max = 0;
        for (int key : map.keySet()) {
            max = Math.max(map.get(key), max);
        }
        return max;
    }

    private int getIndex(int i) {
        int sum = 0;
        while (i > 0) {
            sum += i % 10;
            i /= 10;
        }
        return sum;
    }
}
