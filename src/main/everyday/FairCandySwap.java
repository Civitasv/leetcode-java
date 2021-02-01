package main.everyday;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 公平的糖果棒交换
 */
public class FairCandySwap {
    public int[] fairCandySwap(int[] A, int[] B) {
        int[] ans = new int[2];
        Set<Integer> set = new HashSet<>();
        int aSum = 0, bSum = 0;
        for (int a : A) {
            aSum += a;
            set.add(a);
        }
        for (int b : B)
            bSum += b;

        int c = (aSum - bSum) / 2;
        for (int b : B) {
            int val = b + c;
            if (set.contains(val)) {
                ans[0] = val;
                ans[1] = b;
                break;
            }
        }
        return ans;
    }
}
