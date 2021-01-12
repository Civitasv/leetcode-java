package test;

import main.FindMajorityElement;
import org.junit.jupiter.api.Test;

class FindMajorityElementTest {

    @Test
    void test() {
        FindMajorityElement majorityElement = new FindMajorityElement();
        System.out.println(majorityElement.majorityElement(new int[]{1, 3, 2}));
    }
}