package test;

import main.everyday.RemoveDuplicateLetters;
import org.junit.jupiter.api.Test;

class RemoveDuplicateLettersTest {

    @Test
    void test(){
        RemoveDuplicateLetters removeDuplicateLetters = new RemoveDuplicateLetters();
        System.out.println(removeDuplicateLetters.removeDuplicateLetters("cbacdcbc"));
    }
}