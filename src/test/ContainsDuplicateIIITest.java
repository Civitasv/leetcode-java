package test;


import main.everyday.ContainsDuplicateIII;
import org.junit.jupiter.api.Test;

class ContainsDuplicateIIITest {

    @Test
    void test() {
        ContainsDuplicateIII containsDuplicateIII = new ContainsDuplicateIII();
        System.out.println(containsDuplicateIII.containsNearbyAlmostDuplicate(new int[]{1, 3, 6, 2}, 1, 2));
    }
}