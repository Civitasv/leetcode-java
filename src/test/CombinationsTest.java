package test;

import main.Combinations;
import org.junit.jupiter.api.Test;

class CombinationsTest {
    @Test
    void test() {
        Combinations combinations = new Combinations();
        System.out.println(combinations.combine(4, 2));
    }
}