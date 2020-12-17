package main.offer;

import java.util.*;

/**
 * 最小的k个数
 * 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 */
public class LeastKey {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (k < 1)
            return new int[]{};
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < k; i++)
            res.add(arr[i]);
        for (int i = k; i < arr.length; i++) {
            int query = arr[i];
            if (query > res.get(k - 1))
                continue;
            for (int j = 0; j < k; j++) {
                if (query < res.get(j)) {
                    res.remove(k - 1);
                    res.add(j, query);
                    break;
                }
            }
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++)
            result[i] = res.get(i);
        return result;
    }

    public int[] getLeastNumbers2(int[] arr, int k) {
        int[] result = new int[k];
        if (k == 0)
            return result;
        // 大根堆
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int i = 0; i < k; i++) {
            priorityQueue.offer(arr[i]);
        }
        for (int i = k; i < arr.length; i++) {
            if (arr[i] < priorityQueue.peek()) {
                priorityQueue.remove();
                priorityQueue.offer(arr[i]);
            }
        }
        for (int i = 0; i < k; i++) {
            result[i] = priorityQueue.remove();
        }
        return result;
    }
}
