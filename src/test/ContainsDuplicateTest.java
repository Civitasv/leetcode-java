package test;

import main.ContainsDuplicate;
import org.junit.jupiter.api.Test;

class ContainsDuplicateTest {
    @Test
    void test() {
        ContainsDuplicate duplicate = new ContainsDuplicate();
        int[] nums = {1, 2, 3, 1};
        System.out.println(duplicate.containsDuplicate(nums));
    }
}