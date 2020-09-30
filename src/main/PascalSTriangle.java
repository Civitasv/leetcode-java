package main;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
 */
public class PascalSTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> results = new ArrayList<>();
        if (numRows == 0) {
            return results;
        }
        List<Integer> pre = new ArrayList<>();
        pre.add(1);
        results.add(pre);
        numRows--;
        while (numRows != 0) {
            List<Integer> item = new ArrayList<>();
            item.add(1);
            for (int i = 0; i < pre.size() - 1; i++) {
                item.add(pre.get(i) + pre.get(i + 1));
            }
            item.add(1);
            results.add(item);
            pre = item;
            numRows--;
        }
        return results;
    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        while (rowIndex != 0) {
            List<Integer> item = new ArrayList<>();
            item.add(1);
            for (int i = 0; i < result.size() - 1; i++) {
                item.add(result.get(i) + result.get(i + 1));
            }
            item.add(1);
            result = item;
            rowIndex--;
        }
        return result;
    }
}
