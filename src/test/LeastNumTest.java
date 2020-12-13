package test;

import main.contest219.LeastNum;
import org.junit.jupiter.api.Test;

class LeastNumTest {

    @Test
    void test(){
        LeastNum num = new LeastNum();
        System.out.println(num.minPartitions("82734"));
    }
}