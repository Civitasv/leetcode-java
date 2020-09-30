package test;

import main.MajorityElement;
import org.junit.jupiter.api.Test;

class MajorityElementTest {
    @Test
    void test() {
        MajorityElement element = new MajorityElement();
        int[] ele = {6,6,6,7,7};
        System.out.println(element.majorityElement(ele));
    }
}