package main;

import java.util.*;

/**
 * 快照数组
 * <p>
 * 实现支持下列接口的「快照数组」- SnapshotArray：
 * <p>
 * SnapshotArray(int length)- 初始化一个与指定长度相等的 类数组 的数据结构。初始时，每个元素都等于 0。
 * void set(index, val) - 会将指定索引 index 处的元素设置为 val。
 * int snap() - 获取该数组的快照，并返回快照的编号 snap_id（快照号是调用 snap() 的总次数减去 1）。
 * int get(index, snap_id) - 根据指定的 snap_id 选择快照，并返回该快照指定索引 index 的值。
 */
public class SnapshotArray {
    private final List<TreeMap<Integer, Integer>> arrays; // map: snap_id--val
    private int snapId;

    public SnapshotArray(int length) {
        this.snapId = 0;
        this.arrays = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            this.arrays.add(new TreeMap<>());
        }
    }

    public void set(int index, int val) {
        TreeMap<Integer, Integer> map = arrays.get(index);
        map.put(snapId, val);
    }

    public int snap() {
        return snapId++;
    }

    public int get(int index, int snap_id) {
        TreeMap<Integer, Integer> map = arrays.get(index);
        Integer key = map.floorKey(snap_id);
        return key == null ? 0 : map.get(key); // 返回小于或等于snap_id的最大键
    }
}
