package test;

import main.ReverseBits;
import org.junit.jupiter.api.Test;

class ReverseBitsTest {

    @Test
    void test() {
        ReverseBits bits = new ReverseBits();
        System.out.println(bits.reverseBits(-3));
    }
}