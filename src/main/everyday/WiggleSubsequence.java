package main.everyday;

/**
 *
 */
public class WiggleSubsequence {
    public int wiggleMaxLength(int[] nums) {
        if (nums.length < 2)
            return nums.length;
        int count = 1, type = sgn(nums[1] - nums[0]);
        if (type != 0)
            count++;
        for (int i = 1; i < nums.length - 1; i++) {
            int singleType = sgn(nums[i + 1] - nums[i]);
            if (singleType != 0 && singleType != type) {
                count++;
                type = singleType;
            }
        }
        return count;
    }

    private int sgn(int x) {
        return Integer.compare(x, 0);
    }
}
