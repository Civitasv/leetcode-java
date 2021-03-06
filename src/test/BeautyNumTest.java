package test;

import main.contest47.BeautyNum;
import org.junit.jupiter.api.Test;

class BeautyNumTest {

    @Test
    void test(){
        BeautyNum num = new BeautyNum();
        System.out.println(num.beautySum("aabcbaa"));
    }
}