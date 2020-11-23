package main;

/**
 * Given an array of digits, you can write numbers using each digits[i] as many times as we want.  For example, if digits = ['1','3','5'], we may write numbers such as '13', '551', and '1351315'.
 * <p>
 * Return the number of positive integers that can be generated that are less than or equal to a given integer n.
 * <p>
 * 1 <= digits.length <= 9
 * digits[i].length == 1
 * digits[i] is a digit from '1' to '9'.
 * All the values in digits are unique.
 * 1 <= n <= 109
 */
public class NumbersAtMostNGivenDigitSet {
    public int atMostNGivenDigitSet(String[] D, int N) {
        String S = String.valueOf(N);
        int K = S.length();
        int[] dp = new int[K + 1];
        dp[K] = 1;

        for (int i = K - 1; i >= 0; --i) { // 计算位数等于N的位数时的个数
            // compute dp[i]
            int Si = S.charAt(i) - '0';
            for (String d : D) {
                if (Integer.parseInt(d) < Si) // 小于则随便排
                    dp[i] += Math.pow(D.length, K - i - 1);
                else if (Integer.parseInt(d) == Si) // 否则该数就等于dp[i+1]
                    dp[i] += dp[i + 1];
            }
        }

        for (int i = 1; i < K; ++i) // 位数小于N的位数时的个数
            dp[0] += Math.pow(D.length, i);
        return dp[0];
    }
}
