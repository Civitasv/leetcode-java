package test;

import main.contest245.ReAllocationCharacters;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReAllocationCharactersTest {

    @Test
    void test(){
        ReAllocationCharacters characters = new ReAllocationCharacters();
        System.out.println(characters.makeEqual(new String[]{"abc","aabc","bc"}));
    }
}