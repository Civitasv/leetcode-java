package test;

import main.everyday.DistinctSubsequences;
import org.junit.jupiter.api.Test;

class DistinctSubsequencesTest {

    @Test
    void test() {
        DistinctSubsequences subsequences = new DistinctSubsequences();
        System.out.println(subsequences.numDistinct("ccc", "c"));
    }
}