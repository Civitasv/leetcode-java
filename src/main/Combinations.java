package main;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
 */
public class Combinations {
    private List<List<Integer>> results;

    public List<List<Integer>> combine(int n, int k) {
        results = new ArrayList<>();
        find(n, 0, k, new ArrayList<>());
        return results;
    }

    private void find(int n, int start, int k, List<Integer> item) {
        if (k == 0) {
            results.add(item);
            return;
        }

        for (int i = start; i < n - k + 1; i++) {
            List<Integer> temp = new ArrayList<>(item);
            temp.add(i + 1);
            find(n, i + 1, k - 1, temp);
        }
    }
}
