package test;

import main.everyday.NextGreaterElementII;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class NextGreaterElementIITest {
    @Test
    void test(){
        NextGreaterElementII elementII = new NextGreaterElementII();
        System.out.println(Arrays.toString(elementII.nextGreaterElements(new int[]{1,2,1})));
    }
}