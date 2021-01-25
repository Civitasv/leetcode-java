package test;

import main.SumOfAllOddLengthSubarrays;
import org.junit.jupiter.api.Test;

class SumOfAllOddLengthSubarraysTest {

    @Test
    void test() {
        SumOfAllOddLengthSubarrays sumOfAllOddLengthSubarrays = new SumOfAllOddLengthSubarrays();
        System.out.println(sumOfAllOddLengthSubarrays.sumOddLengthSubarrays(new int[]{1, 4, 2, 5, 3}));
    }
}