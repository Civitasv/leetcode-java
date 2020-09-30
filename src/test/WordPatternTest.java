package test;


import main.WordPattern;
import org.junit.jupiter.api.Test;

class WordPatternTest {

    @Test
    void test() {
        WordPattern pattern = new WordPattern();
        System.out.println(pattern.wordPattern("abba", "dog dog dog dog"));
    }

}