package test;


import main.contest218.DesignGoal;
import org.junit.jupiter.api.Test;

class DesignGoalTest {

    @Test
    void test() {
        DesignGoal designGoal = new DesignGoal();
        System.out.println(designGoal.interpret(""));
    }
}