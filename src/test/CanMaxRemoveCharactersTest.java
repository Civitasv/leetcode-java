package test;


import main.contest245.CanMaxRemoveCharacters;
import org.junit.jupiter.api.Test;

class CanMaxRemoveCharactersTest {

    @Test
    void test() {
        CanMaxRemoveCharacters characters = new CanMaxRemoveCharacters();
        System.out.println(characters.maximumRemovals("abcacb", "ab", new int[]{3, 1, 0}));
    }
}