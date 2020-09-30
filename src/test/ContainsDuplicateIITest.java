package test;

import main.ContainsDuplicateII;
import org.junit.jupiter.api.Test;

class ContainsDuplicateIITest {
    @Test
    void test() {
        ContainsDuplicateII duplicateII = new ContainsDuplicateII();
        int[] nums = {1, 2, 3, 1, 2, 3};
        System.out.println(duplicateII.containsNearbyDuplicate2(nums, 2));
    }
}