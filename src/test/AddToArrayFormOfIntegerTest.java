package test;

import main.everyday.AddToArrayFormOfInteger;
import org.junit.jupiter.api.Test;

class AddToArrayFormOfIntegerTest {

    @Test
    void test() {
        AddToArrayFormOfInteger addToArrayFormOfInteger = new AddToArrayFormOfInteger();
        System.out.println(addToArrayFormOfInteger.addToArrayForm(new int[]{1,2,3,4}, 8766));
    }
}