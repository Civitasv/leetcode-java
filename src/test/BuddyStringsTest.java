package test;

import main.BuddyStrings;
import org.junit.jupiter.api.Test;

class BuddyStringsTest {

    @Test
    void test() {
        BuddyStrings strings = new BuddyStrings();
        System.out.println(strings.buddyStrings("aa", "aa"));
    }
}