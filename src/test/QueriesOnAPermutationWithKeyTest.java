package test;

import main.QueriesOnAPermutationWithKey;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class QueriesOnAPermutationWithKeyTest {

    @Test
    void test() {
        QueriesOnAPermutationWithKey onAPermutationWithKey = new QueriesOnAPermutationWithKey();
        System.out.println(Arrays.toString(onAPermutationWithKey.processQueries2(new int[]{4, 1, 2, 2}, 4)));
    }
}