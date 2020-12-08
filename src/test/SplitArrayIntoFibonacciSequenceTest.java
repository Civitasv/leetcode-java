package test;

import main.everyday.SplitArrayIntoFibonacciSequence;
import org.junit.jupiter.api.Test;

class SplitArrayIntoFibonacciSequenceTest {

    @Test
    void test() {
        SplitArrayIntoFibonacciSequence splitArrayIntoFibonacciSequence = new SplitArrayIntoFibonacciSequence();
        System.out.println(splitArrayIntoFibonacciSequence.splitIntoFibonacci("5511816597"));
    }
}