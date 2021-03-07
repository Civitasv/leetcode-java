package test;

import main.contest231.CheckBitString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckBitStringTest {

    @Test
    void test(){
        CheckBitString string = new CheckBitString();
        System.out.println(string.checkOnesSegment("1"));
    }

}