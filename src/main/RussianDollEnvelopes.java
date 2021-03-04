package main;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 俄罗斯套娃信封问题
 */
public class RussianDollEnvelopes {
    public int maxEnvelopes(int[][] envelopes) {
        if (envelopes.length == 0)
            return 0;
        Arrays.sort(envelopes, (o1, o2) -> {
            if (o1[0] != o2[0]) { // 如果宽度不一致按宽度升序排序
                return o1[0] - o2[0];
            } else { // 否则按高度降序排序
                return o2[1] - o1[1];
            }
        });
        int[] dp = new int[envelopes.length];
        int len = 0;
        for (int[] envelope : envelopes) {
            int index = Arrays.binarySearch(dp, 0, len, envelope[1]);
            if (index < 0)
                index = -(index + 1);
            dp[index] = envelope[1];
            if (index == len)
                len++;
        }
        return len;
    }
}
