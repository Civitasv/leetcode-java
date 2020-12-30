package main;

/**
 * 黑白方格画
 * 小扣注意到秋日市集上有一个创作黑白方格画的摊位。
 * 摊主给每个顾客提供一个固定在墙上的白色画板，画板不能转动。
 * 画板上有 n * n 的网格。绘画规则为，小扣可以选择任意多行以及任意多列的格子涂成黑色，所选行数、列数均可为 0。
 * <p>
 * 小扣希望最终的成品上需要有 k 个黑色格子，请返回小扣共有多少种涂色方案。
 * <p>
 * <b>注意：两个方案中任意一个相同位置的格子颜色不同，就视为不同的方案。</b>
 */
public class BlackWhite {
    public int paintingPlan(int n, int k) {
        int res = 0;
        //边界问题
        if (k == 0 || k == n * n) return 1;

        //第一层循环表示涂 i 行 第二层循环表示涂 j 列
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++)
                //当你涂了 i 行 j 列  则有 i * n + j * n个方格被涂过了
                //去掉重复计入的 i*j个方格 是否等于结果k
                if ((i * n) + (j * n) - (i * j) == k) {
                    res += C(n, i) * C(n, j);
                }
        }
        return res;
    }

    private int C(int m, int n) {
        if (n == 0)
            return 1;
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * (m - i + 1) / i;
        }
        return (int) ans;
    }
}
