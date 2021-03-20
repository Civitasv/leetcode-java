package test;

import main.everyday.EvaluateReversePolishNotation;
import org.junit.jupiter.api.Test;

class EvaluateReversePolishNotationTest {

    @Test
    void test(){
        EvaluateReversePolishNotation reversePolishNotation = new EvaluateReversePolishNotation();
        System.out.println(reversePolishNotation.evalRPN(new String[]{"4","13","5","/","+"}));
    }
}