package test;

import main.everyday.RemoveMaxNumberOfEdgesToKeepGraphFullyTraversable;
import org.junit.jupiter.api.Test;

class RemoveMaxNumberOfEdgesToKeepGraphFullyTraversableTest {

    @Test
    void test() {
        RemoveMaxNumberOfEdgesToKeepGraphFullyTraversable traversable = new RemoveMaxNumberOfEdgesToKeepGraphFullyTraversable();
        System.out.println(traversable.maxNumEdgesToRemove(4, new int[][]{{3, 1, 2}, {3, 2, 3}, {1, 1, 3}, {1, 2, 4}, {1, 1, 2}, {2, 3, 4}}));
    }
}