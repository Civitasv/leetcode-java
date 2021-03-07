package test;

import main.contest231.LeastAddElement;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class LeastAddElementTest {

    @Test
    void test() {
        LeastAddElement element = new LeastAddElement();
        System.out.println(element.minElements(new int[]{1, -10, 9, 1}, 1, 1));
    }
}