package test;

import main.IteratorForCombination;
import org.junit.jupiter.api.Test;

class IteratorForCombinationTest {
    @Test
    void test() {
        IteratorForCombination iteratorForCombination = new IteratorForCombination("abc", 2);
        while (iteratorForCombination.hasNext())
            System.out.println(iteratorForCombination.next());
    }
}