package test;

import main.everyday.Yanghui;
import org.junit.jupiter.api.Test;

class YanghuiTest {

    @Test
    void test() {
        Yanghui yanghui = new Yanghui();
        System.out.println(yanghui.generate(5));
    }
}