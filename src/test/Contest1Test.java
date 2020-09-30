package test;

import main.Contest1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Contest1Test {

    @Test
    public void test() {
        Contest1 s = new Contest1();
        int[] arr = {3, 5, 1};
        System.out.println(s.canMakeArithmeticProgression(arr));

        int[][] mat = {{1, 0, 1}, {1, 1, 0}, {1, 1, 0}};
        System.out.println(s.numSubmat(mat));

        System.out.println((s.minInteger("4321", 4)));
    }
}