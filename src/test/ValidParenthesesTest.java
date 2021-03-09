package test;

import main.ValidParentheses;
import org.junit.jupiter.api.Test;

class ValidParenthesesTest {

    @Test
    void test(){
        ValidParentheses parentheses = new ValidParentheses();
        System.out.println(parentheses.isValid("(){}}{"));
    }
}