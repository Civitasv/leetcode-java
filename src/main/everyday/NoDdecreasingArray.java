package main.everyday;

/**
 * 非递减数列
 */
public class NoDdecreasingArray {
    public boolean checkPossibility(int[] nums) {
        if (nums.length == 1)
            return true;
        int n = nums.length;
        int right = 1, change = 1;
        while (right < n) {
            if (nums[right - 1] > nums[right]) {
                if (change >= 1) {
                    change--;
                    if (right - 2 >= 0) {
                        if (nums[right - 2] > nums[right])
                            nums[right] = nums[right - 1];
                        else nums[right - 1] = nums[right];
                    } else {
                        nums[right - 1] = nums[right];
                    }
                    nums[right] = nums[right - 1];
                } else return false;
            }
            right++;
        }
        return true;
    }
}
