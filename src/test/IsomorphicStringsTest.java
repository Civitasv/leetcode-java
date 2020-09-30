package test;

import main.IsomorphicStrings;
import org.junit.jupiter.api.Test;

class IsomorphicStringsTest {
    @Test
    void test() {
        IsomorphicStrings strings = new IsomorphicStrings();
        System.out.println(strings.isIsomorphic("ab","aa"));
    }
}