package test;

import main.everyday.FindTheDifference;
import org.junit.jupiter.api.Test;

class FindTheDifferenceTest {

    @Test
    void test() {
        FindTheDifference difference = new FindTheDifference();
        System.out.println(difference.findTheDifference2("abcd", "aabcd"));
    }
}