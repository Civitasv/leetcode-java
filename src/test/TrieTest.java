package test;

import main.everyday.Trie;
import org.junit.jupiter.api.Test;

class TrieTest {

    @Test
    void test() {
        Trie trie = new Trie();
        trie.insert("sea");
        trie.insert("seal");
        System.out.println(trie.startsWith("se"));
    }
}