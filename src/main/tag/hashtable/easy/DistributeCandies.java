package main.tag.hashtable.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * 分糖果
 * <p>
 * 总类型数目和总数目/2的最小值
 */
public class DistributeCandies {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for (int type : candyType)
            set.add(type);
        return Math.min(set.size(), candyType.length / 2);
    }
}
