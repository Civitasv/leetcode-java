package main.everyday;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 每日温度
 */
public class DailyTemperatures {
    public int[] dailyTemperatures(int[] T) {
        int n = T.length;
        int[] res = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && T[stack.peek()] < T[i]) {
                res[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }
        return res;
    }
}
