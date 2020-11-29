package test;

import main.contest1129.MostCompete;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class MostCompeteTest {

    @Test
    void test() {
        MostCompete mostCompete = new MostCompete();
        System.out.println(Arrays.toString(mostCompete.mostCompetitive(new int[]{71, 18, 52, 29, 55, 73, 24, 42, 66, 8, 80, 2}, 3)));
    }
}