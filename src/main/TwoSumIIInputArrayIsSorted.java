package main;

/**
 * Given an array of integers that is already sorted in ascending order,
 * find two numbers such that they add up to a specific target number.
 * <p>
 * The function twoSum should return indices of the two numbers
 * such that they add up to the target, where index1 must be less than index2.
 */
public class TwoSumIIInputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        int lo = 0, hi = numbers.length - 1;
        int[] res = new int[2];
        while (lo < hi) {
            if (numbers[lo] + numbers[hi] > target) {
                hi--;
            } else if (numbers[lo] + numbers[hi] < target) {
                lo++;
            } else {
                res[0] = lo + 1;
                res[1] = hi + 1;
                break;
            }
        }
        return res;
    }
}
