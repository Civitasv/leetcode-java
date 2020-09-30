package test;

import main.ImplementQueueUsingStacks;
import org.junit.jupiter.api.Test;

class ImplementQueueUsingStacksTest {
    @Test
    void test() {
        ImplementQueueUsingStacks queues = new ImplementQueueUsingStacks();
        queues.push(1);
        queues.push(2);
        queues.push(3);
        System.out.println(queues.peek());
        int param_2 = queues.pop();
        System.out.println(param_2);
        boolean param_4 = queues.empty();
        System.out.println(param_4);
    }
}