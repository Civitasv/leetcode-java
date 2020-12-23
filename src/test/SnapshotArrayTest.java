package test;

import main.SnapshotArray;
import org.junit.jupiter.api.Test;

class SnapshotArrayTest {

    @Test
    void test() {
        SnapshotArray snapshotArr = new SnapshotArray(1); // 初始化一个长度为 3 的快照数组
        snapshotArr.set(0, 15);  // 令 array[0] = 5
        System.out.println(snapshotArr.snap());  // 获取快照，返回 snap_id = 0
        System.out.println(snapshotArr.snap());  // 获取快照，返回 snap_id = 0
        System.out.println(snapshotArr.snap());  // 获取快照，返回 snap_id = 0
        System.out.println(snapshotArr.get(0, 2));  // 获取 snap_id = 0 的快照中 array[0] 的值，返回 5
        System.out.println(snapshotArr.snap());  // 获取快照，返回 snap_id = 0
        System.out.println(snapshotArr.snap());  // 获取快照，返回 snap_id = 0
        System.out.println(snapshotArr.get(0, 0));  // 获取 snap_id = 0 的快照中 array[0] 的值，返回 5
    }
}