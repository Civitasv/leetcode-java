package main.everyday;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 设计哈希映射
 */
public class MyHashMap {
    private final int SIZE = 857;
    private final List<LinkedList<int[]>> data; // 存储数组，key-value

    /**
     * Initialize your data structure here.
     */
    public MyHashMap() {
        data = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) {
            data.add(new LinkedList<>());
        }
    }

    /**
     * value will always be non-negative.
     */
    public void put(int key, int value) {
        int hash = hash(key);
        for (int[] arr : data.get(hash)) {
            if (arr[0] == key) {
                arr[1] = value;
                return;
            }
        }
        data.get(hash).offerLast(new int[]{key, value});
    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
     */
    public int get(int key) {
        int hash = hash(key);
        for (int[] arr : data.get(hash)) {
            if (arr[0] == key) return arr[1];
        }
        return -1;
    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping for the key
     */
    public void remove(int key) {
        int hash = hash(key);
        for (int[] arr : data.get(hash)) {
            if (arr[0] == key) {
                data.get(hash).remove(arr);
                return;
            }
        }
    }

    private int hash(int key) {
        return (key & 0x7fffffff) % SIZE;
    }
}
