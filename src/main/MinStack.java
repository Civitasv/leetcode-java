package main;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> val;
    private int min;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        val = new Stack<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int x) {
        if (x <= min) {
            val.push(min);
            min = x;
        }
        val.push(x);
    }

    public void pop() {
        if(val.pop() == min) min=val.pop();
    }

    public int top() {
        return val.peek();
    }

    public int getMin() {
        return min;
    }
}
