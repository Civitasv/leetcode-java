package main.everyday;

import java.util.*;

/**
 * 设计哈希集合
 */
public class MyHashSet {
    private final int BASE = 877;
    private final List<LinkedList<Integer>> data;

    /**
     * Initialize your data structure here.
     */
    public MyHashSet() {
        data = new ArrayList<>();
        for (int i = 0; i < BASE; i++) {
            data.add(new LinkedList<>());
        }
    }

    public void add(int key) {
        int hash = hash(key);
        for (int ele : data.get(hash)) {
            if (ele == key)
                return;
        }
        data.get(hash).offerLast(key);
    }

    public void remove(int key) {
        int hash = hash(key);
        for (Integer ele : data.get(hash)) {
            if (ele == key) {
                data.get(hash).remove(ele);
                return;
            }
        }
    }

    /**
     * Returns true if this set contains the specified element
     */
    public boolean contains(int key) {
        int hash = hash(key);
        for (int ele : data.get(hash)) {
            if (ele == key) {
                return true;
            }
        }
        return false;
    }

    private int hash(int key) {
        return (Objects.hash(key) & 0x7fffffff) % BASE;
    }
}
