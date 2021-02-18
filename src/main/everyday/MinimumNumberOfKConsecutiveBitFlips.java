package main.everyday;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * K 连续位的最小翻转次数
 */
public class MinimumNumberOfKConsecutiveBitFlips {
    public int minKBitFlips(int[] A, int K) {
        int n = A.length;
        int steps = 0;
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if (!queue.isEmpty() && i >= queue.peek() + K) {
                queue.poll();
            }
            if (queue.size() % 2 == A[i]) { // 需要反转
                if (i + K > n) return -1;
                steps++;
                queue.offer(i);
            }
        }
        return steps;
    }
}
