package main;

import java.util.ArrayDeque;
import java.util.Queue;

public class ImplementStackUsingQueues {
    Queue<Integer> queue;

    /**
     * Initialize your data structure here.
     */
    public ImplementStackUsingQueues() {
        queue = new ArrayDeque<>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        queue.add(x);
        int n = queue.size();
        for (int i = 0; i < n - 1; i++)
            queue.add(queue.remove());
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        return queue.remove();
    }

    /**
     * Get the top element.
     */
    public int top() {
        return queue.peek();
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return queue.isEmpty();
    }
}
