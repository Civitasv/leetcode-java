package test;


import main.contest218.KAndArray;
import org.junit.jupiter.api.Test;

class KAndArrayTest {

    @Test
    void test() {
        KAndArray kAndArray = new KAndArray();
        System.out.println(kAndArray.maxOperations(new int[]{}, 5));
    }
}