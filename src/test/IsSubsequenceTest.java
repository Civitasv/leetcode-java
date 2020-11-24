package test;

import main.IsSubsequence;
import org.junit.jupiter.api.Test;

class IsSubsequenceTest {

    @Test
    void test() {
        IsSubsequence isSubsequence = new IsSubsequence();
        System.out.println(isSubsequence.isSubsequence("aaaaaa", "bbaaaa"));
    }
}