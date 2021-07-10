package main.everyday;

import java.util.*;

/**
 * 基于时间的键值存储
 */
public class TimeBasedKeyValueStore {
    static class Pair implements Comparable<Pair> {
        int timestamp;
        String value;

        Pair(int timestamp, String value) {
            this.timestamp = timestamp;
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return timestamp == pair.timestamp && Objects.equals(value, pair.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(timestamp, value);
        }

        @Override
        public int compareTo(Pair o) {
            return this.timestamp - o.timestamp;
        }
    }

    private final Map<String, List<Pair>> map;

    /**
     * Initialize your data structure here.
     */
    public TimeBasedKeyValueStore() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        List<Pair> pairs = map.getOrDefault(key, new ArrayList<>());
        pairs.add(new Pair(timestamp, value));
        map.put(key, pairs);
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key))
            return "";
        List<Pair> pairs = map.get(key);
        int index = binarySearch(pairs, new Pair(timestamp, ""));
        if (index > 0)
            return pairs.get(index - 1).value;
        else return "";
    }

    private int binarySearch(List<Pair> pairs, Pair pair) {
        int lo = 0, hi = pairs.size() - 1;
        if (hi < 0 || pairs.get(hi).compareTo(pair) <= 0) {
            return hi + 1;
        }
        while (lo <= hi) {
            int mid = lo + ((hi - lo) >> 1);
            Pair p = pairs.get(mid);
            int cmp = p.compareTo(pair);
            if (cmp <= 0) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

}
