package test;

import main.ImplementStackUsingQueues;
import org.junit.jupiter.api.Test;

class ImplementStackUsingQueuesTest {
    @Test
    void test() {
        ImplementStackUsingQueues stack = new ImplementStackUsingQueues();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.top());   // returns 2
        System.out.println(stack.pop());   // returns 2
        System.out.println(stack.empty()); // returns false
    }
}