package test;

import main.everyday.GroupAnagrams;
import org.junit.jupiter.api.Test;

class GroupAnagramsTest {

    @Test
    void test() {
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        System.out.println(groupAnagrams.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }
}