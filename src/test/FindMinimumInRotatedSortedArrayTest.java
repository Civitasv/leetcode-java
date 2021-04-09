package test;

import main.everyday.FindMinimumInRotatedSortedArray;
import org.junit.jupiter.api.Test;

class FindMinimumInRotatedSortedArrayTest {

    @Test
    void test(){
        FindMinimumInRotatedSortedArray array = new FindMinimumInRotatedSortedArray();
        System.out.println(array.findMin(new int[]{3,4,5,1,2}));
    }
}