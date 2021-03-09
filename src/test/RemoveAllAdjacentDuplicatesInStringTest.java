package test;

import main.everyday.RemoveAllAdjacentDuplicatesInString;
import org.junit.jupiter.api.Test;

class RemoveAllAdjacentDuplicatesInStringTest {

    @Test
    void test(){
        RemoveAllAdjacentDuplicatesInString string = new RemoveAllAdjacentDuplicatesInString();
        System.out.println(string.removeDuplicates("abbaca"));
    }
}