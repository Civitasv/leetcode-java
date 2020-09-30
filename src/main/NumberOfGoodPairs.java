package main;

/**
 * Given an array of integers nums.
 * <p>
 * A pair (i,j) is called good if nums[i] == nums[j] and i < j.
 * <p>
 * Return the number of good pairs.
 */
public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
