package test;

import main.everyday.FirstUniqueCharacterInAString;
import org.junit.jupiter.api.Test;

class FirstUniqueCharacterInAStringTest {

    @Test
    void test(){
        FirstUniqueCharacterInAString firstUniqueCharacterInAString = new FirstUniqueCharacterInAString();
        System.out.println(firstUniqueCharacterInAString.firstUniqChar("loveleetcode"));
    }
}