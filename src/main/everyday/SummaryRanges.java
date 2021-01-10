package main.everyday;

import java.util.ArrayList;
import java.util.List;

/**
 * 汇总区间
 */
public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            StringBuilder builder = new StringBuilder();
            builder.append(nums[i]);
            boolean exist = false;
            while (i < nums.length - 1 && nums[i + 1] - nums[i] == 1) {
                exist = true;
                i++;
            }
            if (exist) {
                builder.append("->").append(nums[i]);
            }
            res.add(builder.toString());
        }
        return res;
    }
}
