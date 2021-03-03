package test;

import main.RussianDollEnvelopes;
import org.junit.jupiter.api.Test;

class RussianDollEnvelopesTest {

    @Test
    void test() {
        RussianDollEnvelopes envelopes = new RussianDollEnvelopes();
        System.out.println(envelopes.maxEnvelopes(new int[][]{{5, 4}, {6, 4}, {6, 7}, {2, 3}}));
    }
}