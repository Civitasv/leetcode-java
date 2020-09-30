package test;

import main.CountAndSay;
import org.junit.jupiter.api.Test;

public class CountAndSayTest {
    @Test
    public void test() {
        CountAndSay countAndSay = new CountAndSay();
        System.out.println(countAndSay.countAndSay2(6));
    }
}
