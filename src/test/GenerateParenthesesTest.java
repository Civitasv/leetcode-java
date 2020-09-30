package test;

import main.GenerateParentheses;
import org.junit.jupiter.api.Test;

public class GenerateParenthesesTest {

    @Test
    public void test(){
        GenerateParentheses generateParentheses = new GenerateParentheses();
        System.out.println(generateParentheses.generateParenthesis(3));
    }
}
