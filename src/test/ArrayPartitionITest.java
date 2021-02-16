package test;

import main.everyday.ArrayPartitionI;
import org.junit.jupiter.api.Test;

class ArrayPartitionITest {

    @Test
    void test(){
        ArrayPartitionI partitionI = new ArrayPartitionI();
        System.out.println(partitionI.arrayPairSum(new int[]{6,2,6,5,1,2}));
    }
}