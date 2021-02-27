package test;

import main.everyday.LongestSubstringWithAtLeastKRepeatingCharacters;
import org.junit.jupiter.api.Test;

class LongestSubstringWithAtLeastKRepeatingCharactersTest {

    @Test
    void test() {
        LongestSubstringWithAtLeastKRepeatingCharacters characters = new LongestSubstringWithAtLeastKRepeatingCharacters();
        System.out.println(characters.longestSubstring("aaaaaaaaaaaabcdefghijklmnopqrstuvwzyz", 3));
    }
}