package main;

/**
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 * <p>
 * Note:
 * <p>
 * The input array will only contain 0 and 1.
 * The length of input array is a positive integer and will not exceed 10,000
 */
public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums.length == 1 && nums[0] == 1)
            return 1;
        int max = 0, temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) temp++;
            if (i + 1 < nums.length) {
                if (nums[i] != nums[i + 1]) {
                    max = Math.max(max, temp);
                    temp = 0;
                }
            } else {
                max = Math.max(max, temp);
            }
        }
        return max;
    }
}
