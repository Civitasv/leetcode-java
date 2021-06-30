package test;


import main.tag.hashtable.easy.MissingNumber;
import org.junit.jupiter.api.Test;

class MissingNumberTest {

    @Test
    void test() {
        MissingNumber missingNumber = new MissingNumber();
        System.out.println(missingNumber.missingNumberConstantSpace(new int[]{0, 1}));
    }
}