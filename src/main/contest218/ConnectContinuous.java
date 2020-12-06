package main.contest218;

/**
 * 给你一个整数 n ，请你将 1 到 n 的二进制表示连接起来，并返回连接结果对应的 十进制 数字对 109 + 7 取余的结果。
 */
public class ConnectContinuous {
    private static final int MOD = 1000000007;

    public int concatenatedBinary(int n) {
        int res = 0, shift = 0;
        for (int i = 1; i <= n; i++) {
            if ((i & (i - 1)) == 0) {
                // 说明是2的幂，则进位
                shift++;
            }
            res = (int) ((((long) res << shift) + i) % MOD);
        }
        return res;
    }
}
