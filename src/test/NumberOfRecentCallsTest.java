package test;

import main.NumberOfRecentCalls;
import org.junit.jupiter.api.Test;

public class NumberOfRecentCallsTest {
    @Test
    public void test() {
        NumberOfRecentCalls recentCounter = new NumberOfRecentCalls();
        System.out.println(recentCounter.ping(642));     // requests = [1], range is [-2999,1], return 1
        System.out.println(recentCounter.ping(1849));   // requests = [1, 100], range is [-2900,100], return 2
        System.out.println(recentCounter.ping(4921));  // requests = [1, 100, 3001], range is [1,3001], return 3
        System.out.println(recentCounter.ping(5936));  // requests = [1, 100, 3001, 3002], range is [2,3002], return 3
        System.out.println(recentCounter.ping(5957));  // requests = [1, 100, 3001, 3002], range is [2,3002], return 3
    }
}
