package main;

import java.util.*;

public class IteratorForCombination {

    private Queue<String> queue;

    public IteratorForCombination(String characters, int combinationLength) {
        queue = new ArrayDeque<>();
        find(characters, "", 0, combinationLength);
    }

    private void find(String characters, String str, int start, int combinationLength) {
        if (combinationLength == 0){
            queue.add(str);
            return;
        }
        for (int i = start; i < characters.length(); i++) {
            find(characters, str + characters.charAt(i), i + 1, combinationLength - 1);
        }
    }

    public String next() {
        return queue.poll();
    }

    public boolean hasNext() {
        return !queue.isEmpty();
    }
}
