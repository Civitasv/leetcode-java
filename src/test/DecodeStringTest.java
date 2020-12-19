package test;


import main.DecodeString;
import org.junit.jupiter.api.Test;

class DecodeStringTest {

    @Test
    void test() {
        DecodeString decodeString = new DecodeString();
        System.out.println(decodeString.decodeString("10[as]"));
    }
}