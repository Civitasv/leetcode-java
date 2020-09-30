package main;

import java.util.Stack;

public class ImplementQueueUsingStacks {

    private Stack<Integer> stack;
    private Stack<Integer> stack2;

    private int front;

    /**
     * Initialize your data structure here.
     */
    public ImplementQueueUsingStacks() {
        stack = new Stack<>();
        stack2 = new Stack<>();
        front = 0;
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        if (stack.isEmpty())
            front = x;
        stack.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack.isEmpty())
                stack2.push(stack.pop());
        }
        return stack2.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (!stack2.isEmpty()) {
            return stack2.peek();
        }
        return front;
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return stack.isEmpty() && stack2.isEmpty();
    }

}
