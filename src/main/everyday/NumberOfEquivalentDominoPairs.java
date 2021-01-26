package main.everyday;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 等价多米诺骨牌对的数量
 */
public class NumberOfEquivalentDominoPairs {
    static class Pair {
        private final int a;
        private final int b;

        public Pair(int a, int b) {
            this.a = Math.min(a, b);
            this.b = Math.max(a, b);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return a == pair.a && b == pair.b;
        }

        @Override
        public int hashCode() {
            return Objects.hash(a, b);
        }
    }

    public int numEquivDominoPairs(int[][] dominoes) {
        int count = 0;
        Map<Pair, Integer> map = new HashMap<>();
        for (int[] domino : dominoes) {
            Pair pair = new Pair(domino[0], domino[1]);
            if (map.containsKey(pair)) {
                map.put(pair, map.get(pair) + 1);
            } else {
                map.put(pair, 1);
            }
        }
        for (Pair pair : map.keySet()) {
            count += C(map.get(pair), 2);
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
