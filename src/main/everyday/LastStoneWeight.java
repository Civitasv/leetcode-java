package main.everyday;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 最后一块石头的重量
 * 有一堆石头，每块石头的重量都是正整数。
 * <p>
 * 每一回合，从中选出两块 最重的 石头，然后将它们一起粉碎。假设石头的重量分别为 x 和 y，且 x <= y。那么粉碎的可能结果如下：
 * <p>
 * 如果 x == y，那么两块石头都会被完全粉碎；
 * 如果 x != y，那么重量为 x 的石头将会完全粉碎，而重量为 y 的石头新重量为 y-x。
 * 最后，最多只会剩下一块石头。返回此石头的重量。如果没有石头剩下，就返回 0。
 */
public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        if (stones.length == 1)
            return stones[0];
        int n = stones.length;
        while (true) {
            Arrays.sort(stones);
            int a = stones[n - 1];
            int b = stones[n - 2];
            if (b == 0) {
                return a;
            }
            stones[n - 1] = a - b;
            stones[n - 2] = 0;
        }
    }

    public int lastStoneWeight2(int[] stones) {
        if (stones.length == 1)
            return stones[0];
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int stone : stones) {
            priorityQueue.offer(stone);
        }
        while (priorityQueue.size() >= 2) {
            int a = priorityQueue.poll();
            int b = priorityQueue.poll();
            if (a != b) {
                priorityQueue.offer(a - b);
            }
        }
        return priorityQueue.isEmpty() ? 0 : priorityQueue.poll();
    }
}
