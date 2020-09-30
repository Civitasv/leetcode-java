package test;

import main.GetTheMaximumScore;
import org.junit.jupiter.api.Test;

class GetTheMaximumScoreTest {
    @Test
    void test() {
        GetTheMaximumScore score = new GetTheMaximumScore();
        int[] nums1 = {2, 4, 5, 8, 10};
        int[] nums2 = {4, 6, 8, 9};
        System.out.println(score.maxSum(nums1, nums2));
    }
}