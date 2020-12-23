package test;

import main.Permutations;
import org.junit.jupiter.api.Test;

class PermutationsTest {

    @Test
    void test() {
        Permutations permutations = new Permutations();
        System.out.println(permutations.permute(new int[]{1, 2, 3}));
    }
}