package test;


import main.everyday.DecodeWays;
import org.junit.jupiter.api.Test;

class DecodeWaysTest {

    @Test
    void test(){
        DecodeWays decodeWays = new DecodeWays();
        System.out.println(decodeWays.numDecodings("226"));
    }
}