package test;

import main.tag.dichotomy.easy.FindSmallestLetterGreaterThanTarget;
import org.junit.jupiter.api.Test;

class FindSmallestLetterGreaterThanTargetTest {
    @Test
    void test() {
        FindSmallestLetterGreaterThanTarget thanTarget = new FindSmallestLetterGreaterThanTarget();
        System.out.println(thanTarget.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'z'));
    }
}