package test;

import main.MaximumSubarray;
import org.junit.jupiter.api.Test;

class MaximumSubarrayTest {

    @Test
    public void test() {
        MaximumSubarray subarray = new MaximumSubarray();
        int[] A = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(subarray.maxSubArray(A));
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ false);
    }

}