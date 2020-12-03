package test;


import main.GetMaximumInGeneratedArray;
import org.junit.jupiter.api.Test;

class GetMaximumInGeneratedArrayTest {
    @Test
    void test(){
        GetMaximumInGeneratedArray getMaximumInGeneratedArray = new GetMaximumInGeneratedArray();
        System.out.println(getMaximumInGeneratedArray.getMaximumGenerated(3));
    }
}