package test;

import main.everyday.PathWithMinimumEffort;
import org.junit.jupiter.api.Test;

class PathWithMinimumEffortTest {

    @Test
    void test() {
        PathWithMinimumEffort effort = new PathWithMinimumEffort();
        System.out.println(effort.minimumEffortPath(new int[][]{{1,2,1,1,1}, {1,2,1,2,1}, {1,2,1,2,1},{1,2,1,2,1},{1,1,1,2,1}}));
    }
}