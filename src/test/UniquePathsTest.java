package test;

import main.everyday.UniquePaths;
import org.junit.jupiter.api.Test;

class UniquePathsTest {

    @Test
    void test() {
        UniquePaths uniquePaths = new UniquePaths();
        System.out.println(uniquePaths.dp(3, 7));
    }
}