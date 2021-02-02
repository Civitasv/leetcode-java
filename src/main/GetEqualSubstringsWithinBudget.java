package main;

/**
 * 尽可能使字符串相等
 */
public class GetEqualSubstringsWithinBudget {
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();
        int left = 0, right = 0, cost = 0, max = 0;
        while (right < n) {
            cost += Math.abs(s.charAt(right) - t.charAt(right));
            // 判断是否符合规则
            while (cost > maxCost) {
                cost -= Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;
    }
}
