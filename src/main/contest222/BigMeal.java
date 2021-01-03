package main.contest222;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 大餐计数
 * 大餐 是指 恰好包含两道不同餐品 的一餐，其美味程度之和等于 2 的幂。
 * <p>
 * 你可以搭配 任意 两道餐品做一顿大餐。
 * <p>
 * 给你一个整数数组 deliciousness ，其中 deliciousness[i] 是第 i道餐品的美味程度，返回你可以用数组中的餐品做出的不同 大餐 的数量。结果需要对 109 + 7 取余。
 * <p>
 * 注意，只要餐品下标不同，就可以认为是不同的餐品，即便它们的美味程度相同。
 */
public class BigMeal {
    public int countPairs(int[] deliciousness) {
        Map<Integer, Long> map = new HashMap<>();
        long res = 0;
        for (int d : deliciousness) {
            for (int i = 0; i <= 21; i++) {
                res = (res + map.getOrDefault((1 << i) - d, 0L)) % 1000000007;
            }
            map.put(d, map.getOrDefault(d, 0L) + 1);
        }
        return (int) res;
    }
}
