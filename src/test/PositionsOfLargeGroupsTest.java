package test;


import main.everyday.PositionsOfLargeGroups;
import org.junit.jupiter.api.Test;

class PositionsOfLargeGroupsTest {
    @Test
    void test() {
        PositionsOfLargeGroups positionsOfLargeGroups = new PositionsOfLargeGroups();
        System.out.println(positionsOfLargeGroups.largeGroupPositions("abbxxxxzzy"));
    }
}