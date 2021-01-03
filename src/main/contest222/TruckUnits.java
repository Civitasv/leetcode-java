package main.contest222;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 卡车上的最大单元数
 * 请你将一些箱子装在 一辆卡车 上。给你一个二维数组 boxTypes ，其中 boxTypes[i] = [numberOfBoxesi, numberOfUnitsPerBoxi] ：
 * <p>
 * numberOfBoxesi 是类型 i 的箱子的数量。
 * numberOfUnitsPerBoxi 是类型 i 每个箱子可以装载的单元数量。
 * 整数 truckSize 表示卡车上可以装载 箱子 的 最大数量 。只要箱子数量不超过 truckSize ，你就可以选择任意箱子装到卡车上。
 * <p>
 * 返回卡车可以装载 单元 的 最大 总数。
 */
public class TruckUnits {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int count = 0;
        // 按照箱子的单元数量排序
        Arrays.sort(boxTypes, (o1, o2) -> o2[1] - o1[1]);
        for (int[] box : boxTypes) {
            int size = box[0];
            if (truckSize > size) {
                truckSize -= size;
                count += size * box[1];
            } else {
                count += truckSize * box[1];
                break;
            }
        }
        return count;
    }
}
