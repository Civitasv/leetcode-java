package test;

import main.everyday.LongestRepeatingCharacterReplacement;
import org.junit.jupiter.api.Test;

class LongestRepeatingCharacterReplacementTest {

    @Test
    void test() {
        LongestRepeatingCharacterReplacement repeatingCharacterReplacement = new LongestRepeatingCharacterReplacement();
        System.out.println(repeatingCharacterReplacement.characterReplacement("AABABBA", 1));
    }
}