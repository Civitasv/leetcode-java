package test;

import main.AddAndSearchWord;
import org.junit.jupiter.api.Test;

class AddAndSearchWordTest {
    @Test
    void test() {
        AddAndSearchWord word = new AddAndSearchWord();
        word.addWord("ran");
        word.addWord("rune");
        word.addWord("runner");
        word.addWord("runs");
        word.addWord("add");
        word.addWord("adds");
        word.addWord("adder");
        word.addWord("addee");
        System.out.println(word.search("add."));
    }
}