package main.everyday;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 数据流中的第 K 大元素
 */
public class KthLargestElementInAStream {
    private final PriorityQueue<Integer> pq;

    private final int k;

    public KthLargestElementInAStream(int k, int[] nums) {
        this.k = k;
        this.pq = new PriorityQueue<>(k);
        for (int num : nums)
            add(num);
    }

    public int add(int val) {
        if (pq.size() < k)
            pq.offer(val);
        else if (pq.peek() < val) {
            pq.poll();
            pq.offer(val);
        }
        return pq.peek();
    }
}
