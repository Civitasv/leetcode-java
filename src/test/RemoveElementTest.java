package test;


import main.everyday.RemoveElement;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class RemoveElementTest {
    @Test
    void test() {
        RemoveElement removeElement = new RemoveElement();
        int[] arr = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(removeElement.removeElement(arr, 2));
        System.out.println(Arrays.toString(arr));
    }
}