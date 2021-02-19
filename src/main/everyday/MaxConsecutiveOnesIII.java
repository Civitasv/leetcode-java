package main.everyday;

/**
 * 最大连续1的个数 III
 */
public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] A, int K) {
        int n = A.length;
        int left = 0, right = 0, max = 0, nums = 0;
        while (right < n) {
            if (A[right] == 0)
                nums++;
            while (nums > K) {
                if (A[left] == 0)
                    nums--;
                left += 1;
            }
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;
    }
}
