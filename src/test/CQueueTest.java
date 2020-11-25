package test;

import main.offer.CQueue;
import org.junit.jupiter.api.Test;

class CQueueTest {

    @Test
    void test() {
        CQueue obj = new CQueue();
        obj.appendTail(5);
        obj.appendTail(2);
        System.out.println(obj.deleteHead());
        System.out.println(obj.deleteHead());
    }
}