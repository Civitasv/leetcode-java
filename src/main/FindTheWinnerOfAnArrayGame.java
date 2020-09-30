package main;

import java.util.ArrayDeque;
import java.util.Deque;

public class FindTheWinnerOfAnArrayGame {
    public int getWinner(int[] arr, int k) {
        if (k > arr.length) {
            int max = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        } else {
            int count = 0, first = 0, second = 0;
            Deque<Integer> deque = new ArrayDeque<>();
            for (int i = 0; i < arr.length; i++) {
                deque.addLast(arr[i]);
            }
            while (count < k) {
                first = deque.removeFirst();
                second = deque.peekFirst();
                if (first > second) {
                    count++;
                    deque.addLast(deque.removeFirst());
                    deque.addFirst(first);
                } else {
                    count = 1;
                    deque.addLast(first);
                    first = second;
                }
            }
            return first;
        }
    }

}
