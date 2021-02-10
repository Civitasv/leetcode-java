package test;

import main.everyday.KthLargestElementInAStream;
import org.junit.jupiter.api.Test;

class KthLargestElementInAStreamTest {

    @Test
    void test() {
        KthLargestElementInAStream stream = new KthLargestElementInAStream(3, new int[]{4, 5, 8, 2});
        System.out.println(stream.add(3));
        System.out.println(stream.add(5));
        System.out.println(stream.add(10));
        System.out.println(stream.add(9));
        System.out.println(stream.add(4));
    }
}