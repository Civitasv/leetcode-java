package test;

import main.contest1129.MostRich;
import org.junit.jupiter.api.Test;

class MostRichTest {

    @Test
    void test() {
        MostRich rich = new MostRich();
        System.out.println(rich.maximumWealth(new int[][]{{2, 8, 7}, {7, 1, 3}, {1, 9, 5}}));
    }
}