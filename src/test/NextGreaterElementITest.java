package test;

import main.everyday.NextGreaterElementI;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class NextGreaterElementITest {

    @Test
    void test(){
        NextGreaterElementI elementI = new NextGreaterElementI();
        System.out.println(Arrays.toString(elementI.nextGreaterElement(new int[]{4,1,2}, new int[]{1,3,4,2})));
    }
}