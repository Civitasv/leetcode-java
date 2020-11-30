package test;

import main.everyday.ReorganizeString;
import org.junit.jupiter.api.Test;

class ReorganizeStringTest {
    @Test
    void test() {
        ReorganizeString reorganizeString = new ReorganizeString();
        System.out.println(reorganizeString.reorganizeString3("aab"));
    }
}