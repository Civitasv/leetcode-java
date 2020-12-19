package main;

import java.util.HashMap;
import java.util.Map;

/**
 * 给你两个长度相同的整数数组 target 和 arr 。
 * <p>
 * 每一步中，你可以选择 arr 的任意 非空子数组 并将它翻转。你可以执行此过程任意次。
 * <p>
 * 如果你能让 arr 变得与 target 相同，返回 True；否则，返回 False 。
 */
public class MakeTwoArraysEqualByReversingSubArrays {
    public boolean canBeEqual(int[] target, int[] arr) {
        Map<Integer, Integer> map = new HashMap<>(); // val-count

        for (int t : target) {
            if (map.containsKey(t)) {
                int count = map.get(t);
                map.put(t, count + 1);
            } else map.put(t, 1);
        }

        for (int a : arr) {
            if (map.containsKey(a)) {
                int count = map.get(a);
                if (count > 0) map.put(a, count - 1);
                else return false;
            } else return false;
        }
        return true;
    }

    public boolean canBeEqual2(int[] target, int[] arr) {
        int[] countTarget = new int[1001];
        for (int t : target) {
            countTarget[t]++;
        }

        for (int a : arr) {
            if (countTarget[a] > 0)
                countTarget[a]--;
            else return false;
        }

        return true;
    }
}
