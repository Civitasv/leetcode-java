package main.everyday;

import java.util.*;

public class NestedIterator implements Iterator<Integer> {
    private final List<Integer> data = new ArrayList<>();
    private int index = 0;

    private void add(List<NestedInteger> nestedList) {
        for (NestedInteger nestedInteger : nestedList) {
            if (nestedInteger.isInteger())
                data.add(nestedInteger.getInteger());
            else {
                add(nestedInteger.getList());
            }
        }
    }

    public NestedIterator(List<NestedInteger> nestedList) {
        add(nestedList);
    }

    @Override
    public Integer next() {
        return data.get(index++);
    }

    @Override
    public boolean hasNext() {
        return index < data.size();
    }

    interface NestedInteger {
        // @return true if this NestedInteger holds a single integer, rather than a nested list.
        public boolean isInteger();

        // @return the single integer that this NestedInteger holds, if it holds a single integer
        // Return null if this NestedInteger holds a nested list
        public Integer getInteger();

        // @return the nested list that this NestedInteger holds, if it holds a nested list
        // Return null if this NestedInteger holds a single integer
        public List<NestedInteger> getList();
    }
}
