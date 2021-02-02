package main;

import java.util.*;

/**
 * 队列的最大值
 */
public class MaxQueue {

    private Deque<Integer> stack;
    private Deque<Integer> stack2;
    private int max;

    public MaxQueue() {
        stack = new LinkedList<>();
        stack2 = new LinkedList<>();
        max = -1;
    }

    public int max_value() {
        return max;
    }

    public void push_back(int value) {
        stack.push(value);
        max = Math.max(max, value);
    }

    public int pop_front() {
        if (stack.isEmpty() && stack2.isEmpty()) return -1;
        if (!stack2.isEmpty()) {
            int val = stack2.pop();
            if (val == max) {
                if (!stack.isEmpty() && !stack2.isEmpty())
                    max = Math.max(Collections.max(stack), Collections.max(stack2));
                else if (!stack.isEmpty()) max = Collections.max(stack);
                else if (!stack2.isEmpty()) max = Collections.max(stack2);
                else max = -1;
            }
            return val;
        }
        while (!stack.isEmpty()) {
            stack2.push(stack.pop());
        }
        int val = stack2.pop();
        if (val == max) {
            if (stack2.isEmpty()) max = -1;
            else max = Collections.max(stack2);
        }
        return val;
    }
}
