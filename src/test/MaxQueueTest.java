package test;

import main.MaxQueue;
import org.junit.jupiter.api.Test;

class MaxQueueTest {

    @Test
    void test() {
        MaxQueue queue = new MaxQueue();
        queue.push_back(1);
        queue.push_back(2);
        System.out.println(queue.pop_front());
        System.out.println(queue.max_value());
        System.out.println(queue.max_value());
    }
}