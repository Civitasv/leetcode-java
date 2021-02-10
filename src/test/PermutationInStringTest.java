package test;

import main.everyday.PermutationInString;
import org.junit.jupiter.api.Test;

class PermutationInStringTest {

    @Test
    void test() {
        PermutationInString string = new PermutationInString();
        System.out.println(string.checkInclusion("adc", "dcda"));
    }
}