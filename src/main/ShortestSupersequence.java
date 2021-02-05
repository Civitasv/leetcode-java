package main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 最短超串
 */
public class ShortestSupersequence {
    public int[] shortestSeq(int[] big, int[] small) {
        int n = big.length;
        int left = 0, right = 0, len = 0, resLeft = 0, resRight = big.length - 1;
        boolean exist = false;
        Map<Integer, Integer> map = new HashMap<>();
        for (int s : small) {
            len++;
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else map.put(s, 1);
        }
        while (right < n) {
            int b = big[right];
            if (map.containsKey(b)) {
                if (map.get(b) > 0)
                    len--;
                map.put(b, map.get(b) - 1);
            }
            // 如果len等于0了，说明找到了一个
            while (len == 0) {
                exist = true;
                if (right - left + 1 < resRight - resLeft + 1) {
                    resLeft = left;
                    resRight = right;
                }
                // 更新左指针
                int s = big[left];
                if (map.containsKey(s)) {
                    map.put(s, map.get(s) + 1);
                    if (map.get(s) > 0)
                        len++;
                }
                left++;
            }
            right++;
        }
        return exist ? new int[]{resLeft, resRight} : new int[]{};
    }
}
