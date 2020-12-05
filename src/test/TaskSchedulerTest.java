package test;

import main.everyday.TaskScheduler;
import org.junit.jupiter.api.Test;

class TaskSchedulerTest {
    @Test
    void test() {
        TaskScheduler taskScheduler = new TaskScheduler();
        System.out.println(taskScheduler.leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 2));
    }
}