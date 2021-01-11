package test;

import main.everyday.SmallestStringWithSwaps;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class SmallestStringWithSwapsTest {

    @Test
    void test() {
        SmallestStringWithSwaps withSwaps = new SmallestStringWithSwaps();
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(3);
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        lists.add(list);
        lists.add(list2);
        System.out.println(withSwaps.smallestStringWithSwaps("dcab", lists));
    }
}