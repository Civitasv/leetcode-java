package main;

/**
 * 主要元素
 */
public class FindMajorityElement {
    public int majorityElement(int[] nums) {
        int x = 0, vote = 0;
        for (int num : nums) {
            if (vote == 0) x = num;
            vote += num == x ? 1 : -1;
        }
        // 验证是否满足要求
        int t = nums.length / 2 + 1;
        int count = 0;
        for (int num : nums) {
            if (num == x) count++;
            if (count == t) return x;
        }
        return -1;
    }
}
