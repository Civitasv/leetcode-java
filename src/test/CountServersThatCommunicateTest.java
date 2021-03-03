package test;

import main.CountServersThatCommunicate;
import org.junit.jupiter.api.Test;

class CountServersThatCommunicateTest {

    @Test
    void test() {
        CountServersThatCommunicate countServersThatCommunicate = new CountServersThatCommunicate();
        System.out.println(countServersThatCommunicate.countServers(new int[][]{{1, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}}));
    }
}