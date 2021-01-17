package main.contest224;

import java.util.HashMap;
import java.util.Map;

/**
 * 同积元组
 */
public class SamePairs {
    public int tupleSameProduct(int[] nums) {
        int count = 0, n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int a = 0; a < n - 1; a++) {
            for (int b = a + 1; b < n; b++) {
                int multiply = nums[a] * nums[b];
                if (map.containsKey(multiply))
                    map.put(multiply, map.get(multiply) + 1);
                else map.put(multiply, 1);
            }
        }
        for (int key : map.keySet()) {
            int size = map.get(key);
            count += 8 * C(size, 2);
        }
        return count;
    }

    private int C(int m, int n) {
        if (n == 0)
            return 1;
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * (m - i + 1) / i;
        }
        return (int) ans;
    }
}
