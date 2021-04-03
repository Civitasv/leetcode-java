package main.everyday;

import java.util.ArrayDeque;
import java.util.Deque;

public class VolumeOfHistogram {
    public int trap(int[] height) {
        int n = height.length;
        Deque<Integer> stack = new ArrayDeque<>(); // 维护单调栈，栈内递减
        int res = 0;
        for (int i = 0; i < n; i++) {
            int num = height[i];
            while (!stack.isEmpty() && height[stack.peek()] < num) {
                int index = stack.pop();
                if (stack.isEmpty()) continue;
                int l = stack.peek();
                int w = i - l + 1 - 2;
                int h = Math.min(height[l], height[i]) - height[index];
                res += w * h;
            }
            stack.push(i);
        }
        return res;
    }
}
