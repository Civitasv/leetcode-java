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
        int max = 1;
        int[] dp = new int[envelopes.length];
        dp[0] = 1;
        for (int i = 1; i < envelopes.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (envelopes[i][1] > envelopes[j][1]) dp[i] = Math.max(dp[i], dp[j] + 1);
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
