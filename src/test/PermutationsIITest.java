package test;

import main.PermutationsII;
import org.junit.jupiter.api.Test;

class PermutationsIITest {

    @Test
    void test() {
        PermutationsII permutationsII = new PermutationsII();
        System.out.println(permutationsII.permuteUnique(new int[]{1, 1, 2}));
    }
}