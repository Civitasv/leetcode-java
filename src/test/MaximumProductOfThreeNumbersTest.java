package test;

import main.everyday.MaximumProductOfThreeNumbers;
import org.junit.jupiter.api.Test;

class MaximumProductOfThreeNumbersTest {

    @Test
    void test(){
        MaximumProductOfThreeNumbers threeNumbers = new MaximumProductOfThreeNumbers();
        System.out.println(threeNumbers.maximumProduct(new int[]{1,2,3,4}));
    }
}