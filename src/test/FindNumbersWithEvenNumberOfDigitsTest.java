package test;

import main.FindNumbersWithEvenNumberOfDigits;
import org.junit.jupiter.api.Test;

class FindNumbersWithEvenNumberOfDigitsTest {
    @Test
    void test() {
        FindNumbersWithEvenNumberOfDigits numbersWithEvenNumberOfDigits = new FindNumbersWithEvenNumberOfDigits();
        System.out.println(numbersWithEvenNumberOfDigits.findNumbers(new int[]{12, 345, 2, 6, 7896}));
    }
}