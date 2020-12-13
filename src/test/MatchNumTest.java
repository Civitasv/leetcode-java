package test;


import main.contest219.MatchNum;
import org.junit.jupiter.api.Test;

class MatchNumTest {

    @Test
    void test(){
        MatchNum num = new MatchNum();
        System.out.println(num.numberOfMatches(14));
    }
}