package main.everyday;

import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角
 */
public class Yanghui {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows == 0)
            return res;

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            if (i == 0) {
                row.add(1);
                res.add(row);
                continue;
            }
            row.add(1);
            List<Integer> pre = res.get(i - 1);
            for (int j = 0; j < pre.size() - 1; j++) {
                row.add(pre.get(j) + pre.get(j + 1));
            }
            row.add(1);
            res.add(row);
        }
        return res;
    }
}
