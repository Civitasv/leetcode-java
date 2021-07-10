package test;


import main.tag.dichotomy.easy.ValidPerfectSquare;
import org.junit.jupiter.api.Test;

class ValidPerfectSquareTest {
    @Test
    void test(){
        ValidPerfectSquare validPerfectSquare = new ValidPerfectSquare();
        System.out.println(validPerfectSquare.isPerfectSquare(2147483647));
    }
}