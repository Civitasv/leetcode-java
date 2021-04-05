package test;

import main.LCCUP.ByProgram;
import org.junit.jupiter.api.Test;

class ByProgramTest {

    @Test
    void test() {
        ByProgram program = new ByProgram();
        System.out.println(program.purchasePlans(new int[]{2,5}, 4));
    }
}