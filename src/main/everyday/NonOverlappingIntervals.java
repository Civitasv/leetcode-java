package main.everyday;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 无重叠区间
 * 给定一个区间的集合，找到需要移除区间的最小数量，使剩余区间互不重叠。
 * <p>
 * 注意:
 * <p>
 * 可以认为区间的终点总是大于它的起点。
 * 区间 [1,2] 和 [2,3] 的边界相互“接触”，但没有相互重叠。
 */
public class NonOverlappingIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0)
            return 0;
        int count = 0;
        // 按起始点排序 然后对于重叠的 保留终点较小的
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        int first = intervals[0][0], end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            int[] interval = intervals[i];
            if (first == interval[0]) {
                end = Math.min(end, interval[1]);
                count++;
            } else {
                if (end > interval[0]) {
                    count++;
                    if (end > interval[1]) {
                        first = interval[0];
                        end = interval[1];
                    }
                } else {
                    first = interval[0];
                    end = interval[1];
                }
            }
        }
        return count;
    }
}
