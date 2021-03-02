package main.everyday;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 下一个更大元素 II
 */
public class NextGreaterElementII {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++)
            res[i] = -1;
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < 2 * nums.length; i++) {
            int index = i >= nums.length ? i - nums.length : i;
            while (!stack.isEmpty() && nums[stack.peek()] < nums[index]) {
                res[stack.pop()] = nums[index];
            }
            stack.push(index);
        }
        return res;
    }
}
