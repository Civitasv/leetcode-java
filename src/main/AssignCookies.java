package main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 分发饼干
 * <p>
 * 假设你是一位很棒的家长，想要给你的孩子们一些小饼干。但是，每个孩子最多只能给一块饼干。
 * <p>
 * 对每个孩子 i，都有一个胃口值 g[i]，这是能让孩子们满足胃口的饼干的最小尺寸；
 * 并且每块饼干 j，都有一个尺寸 s[j]。如果 s[j] >= g[i]，我们可以将这个饼干 j 分配给孩子 i ，这个孩子会得到满足。你的目标是尽可能满足越多数量的孩子，并输出这个最大数值。
 */
public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        int count = 0, start = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        for (int num : g) {
            while (start < s.length) {
                if (s[start++] >= num) {
                    count++;
                    break;
                }
            }
            if (start == s.length)
                break;
        }
        return count;
    }
}
