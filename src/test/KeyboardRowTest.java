package test;

import main.tag.hashtable.easy.KeyboardRow;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class KeyboardRowTest {

    @Test
    void test() {
        KeyboardRow keyboardRow = new KeyboardRow();
        System.out.println(Arrays.toString(keyboardRow.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"})));
    }
}