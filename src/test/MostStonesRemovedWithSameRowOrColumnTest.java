package test;

import main.everyday.MostStonesRemovedWithSameRowOrColumn;
import org.junit.jupiter.api.Test;

class MostStonesRemovedWithSameRowOrColumnTest {

    @Test
    void test() {
        MostStonesRemovedWithSameRowOrColumn mostStonesRemovedWithSameRowOrColumn = new MostStonesRemovedWithSameRowOrColumn();
        System.out.println(mostStonesRemovedWithSameRowOrColumn.removeStones(new int[][]{{0, 1}, {1, 0}, {1, 1}}));
    }
}