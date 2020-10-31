package test;

import main.MaximumNestingDepthOfTheParentheses;
import org.junit.jupiter.api.Test;

class MaximumNestingDepthOfTheParenthesesTest {
    @Test
    void test() {
        MaximumNestingDepthOfTheParentheses parentheses = new MaximumNestingDepthOfTheParentheses();
        System.out.println(parentheses.maxDepth("(1+(2*3)+((8)/4))+1"));
    }
}