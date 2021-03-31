package test;


import main.everyday.SubsetsII;
import org.junit.jupiter.api.Test;

class SubsetsIITest {

    @Test
    void test() {
        SubsetsII subsetsII = new SubsetsII();
        System.out.println(subsetsII.subsetsWithDup(new int[]{4, 1, 0}));
    }
}