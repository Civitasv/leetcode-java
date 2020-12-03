package test;

import main.everyday.IncreasingDecreasingString;
import org.junit.jupiter.api.Test;

class IncreasingDecreasingStringTest {

    @Test
    void test() {
        IncreasingDecreasingString string = new IncreasingDecreasingString();
        System.out.println(string.sortString("aaaabbbbcccc"));
    }
}