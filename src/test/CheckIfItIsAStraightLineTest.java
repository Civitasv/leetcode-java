package test;

import main.everyday.CheckIfItIsAStraightLine;
import org.junit.jupiter.api.Test;

class CheckIfItIsAStraightLineTest {

    @Test
    void test(){
        CheckIfItIsAStraightLine line = new CheckIfItIsAStraightLine();
        System.out.println(line.checkStraightLine(new int[][]{{1,1},{2,2},{3,4}}));
    }
}