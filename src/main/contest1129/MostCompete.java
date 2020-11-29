package main.contest1129;

/**
 * 给你一个整数数组 nums 和一个正整数 k ，返回长度为 k 且最具 竞争力 的 nums 子序列。
 * 数组的子序列是从数组中删除一些元素（可能不删除元素）得到的序列。
 * <p>
 * 在子序列 a 和子序列 b 第一个不相同的位置上，如果 a 中的数字小于 b 中对应的数字，
 * 那么我们称子序列 a 比子序列 b（相同长度下）更具 竞争力 。
 * 例如，[1,3,4] 比 [1,3,5] 更具竞争力，在第一个不相同的位置，也就是最后一个位置上， 4 小于 5 。
 */
public class MostCompete {
    public int[] mostCompetitive(int[] nums, int k) {
        if (isIncreasing(nums, 0, nums.length)) {
            int[] res = new int[k];
            if (k >= 0) System.arraycopy(nums, 0, res, 0, k);
            return res;
        }
        if (isDecreasing(nums, 0, nums.length)) {
            int[] res = new int[k];
            if (k >= 0) System.arraycopy(nums, nums.length - k, res, 0, k);
            return res;
        }
        int[] res = new int[k];
        int start = 0, n = nums.length;
        for (int i = k; i > 0; i--) {
            int[] data = lowest(nums, start, n - i + 1);
            res[k - i] = data[0];
            start = data[1];
        }
        return res;
    }

    // 获得最小值及对应索引
    public int[] lowest(int[] nums, int start, int end) {
        if (isIncreasing(nums, start, end)) {
            return new int[]{nums[start], start + 1};
        }
        if (isDecreasing(nums, start, end)) {
            return new int[]{nums[end - 1], end};
        }
        int lowest = Integer.MAX_VALUE, index = start;
        for (int i = start; i < end; i++) {
            if (nums[i] < lowest) {
                lowest = nums[i];
                index = i;
            }
        }
        return new int[]{lowest, index + 1};
    }

    // 判断单调增
    public boolean isIncreasing(int[] nums, int start, int end) {
        for (int i = start; i < end - 1; i++) {
            if (nums[i] > nums[i + 1])
                return false;
        }
        return true;
    }

    // 判断单调减
    public boolean isDecreasing(int[] nums, int start, int end) {
        for (int i = start; i < end - 1; i++) {
            if (nums[i] < nums[i + 1])
                return false;
        }
        return true;
    }
}
