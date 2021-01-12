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
        return x;
    }
}
