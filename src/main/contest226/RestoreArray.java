package main.contest226;

import java.util.*;

/**
 * 从相邻元素对还原数组
 */
public class RestoreArray {
    public int[] restoreArray(int[][] adjacentPairs) {
        int n = adjacentPairs.length + 1;
        int[] res = new int[n];
        Map<Integer, List<Integer>> map = new HashMap<>(); // key：某元素 value：该元素相邻的元素
        for (int[] adjacentPair : adjacentPairs) {
            if (map.containsKey(adjacentPair[0])) {
                List<Integer> list = map.get(adjacentPair[0]);
                list.add(adjacentPair[1]);
            } else {
                List<Integer> list = new LinkedList<>();
                list.add(adjacentPair[1]);
                map.put(adjacentPair[0], list);
            }

            if (map.containsKey(adjacentPair[1])) {
                List<Integer> list = map.get(adjacentPair[1]);
                list.add(adjacentPair[0]);
            } else {
                List<Integer> list = new LinkedList<>();
                list.add(adjacentPair[0]);
                map.put(adjacentPair[1], list);
            }
        }
        for (int key : map.keySet()) {
            List<Integer> list = map.get(key);
            if (list.size() == 1) {
                res[0] = key;
                break;
            }
        }

        for (int i = 1; i < n; i++) {
            List<Integer> list = map.get(res[i - 1]);
            if (list.size() == 1) {
                res[i] = list.get(0);
            } else if (list.size() == 2) {
                for (int key : list) {
                    if (map.containsKey(key))
                        res[i] = key;
                }
            }
            map.remove(res[i - 1]);
        }
        return res;
    }
}
