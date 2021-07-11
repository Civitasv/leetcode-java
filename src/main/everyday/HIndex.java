package main.everyday;

import java.util.Arrays;

/**
 * H 指数
 * <p>
 * 思路：此题不难，但要考虑一种特殊情况，即研究者的所有论文引用数目均超过论文数目，此时需要返回论文数目n
 * <p>
 * 思路2：将数组排序，则对于索引i，有n-i个论文引用数目不低于citations[i]，i个论文引用数目不高于citations[i]，
 * 显然若citations[i]>=h，有n-i个论文引用数目不低于h，i个论文引用数目不高于h，满足条件
 */
public class HIndex {
    public int hIndex(int[] citations) {
        int n = citations.length;
        if (n == 0) return 0;
        Arrays.sort(citations);
        if (citations[0] >= n) return n;
        for (int i = 0; i < n - 1; i++) {
            int now = citations[i];
            int next = citations[i + 1];
            if (next >= (n - i - 1) && now <= (n - i - 1)) {
                return n - i - 1;
            }
        }
        return 0;
    }

    private int hIndex2(int[] citations) {
        Arrays.sort(citations);
        for (int i = 0, n = citations.length; i < n; i++) {
            int h = n - i;
            if (citations[i] >= h)
                return h;
        }
        return 0;
    }
}
