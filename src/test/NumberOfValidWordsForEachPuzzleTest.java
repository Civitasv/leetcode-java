package test;

import main.everyday.NumberOfValidWordsForEachPuzzle;
import org.junit.jupiter.api.Test;

class NumberOfValidWordsForEachPuzzleTest {

    @Test
    void test() {
        NumberOfValidWordsForEachPuzzle puzzle = new NumberOfValidWordsForEachPuzzle();
        System.out.println(puzzle.findNumOfValidWords(new String[]{"aaaa", "asas", "able", "ability", "actt", "actor", "access"}, new String[]{"aboveyz", "abrodyz", "abslute", "absoryz", "actresz", "gaswxyz"}));
    }
}