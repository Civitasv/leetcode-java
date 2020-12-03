package main.offer;

import java.util.Stack;

public class CQueue {
    private final Stack<Integer> insertStack;
    private final Stack<Integer> deleteStack;

    public CQueue() {
        insertStack = new Stack<>();
        deleteStack = new Stack<>();
    }

    public void appendTail(int value) {
        insertStack.add(value);
    }

    public int deleteHead() {
        if (insertStack.isEmpty() && deleteStack.isEmpty())
            return -1;
        if (!deleteStack.isEmpty())
            return deleteStack.pop();
        while (!insertStack.isEmpty())
            deleteStack.add(insertStack.pop());
        return deleteStack.pop();
    }
}

