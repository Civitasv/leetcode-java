package test;


import main.tag.dichotomy.easy.PeakIndexInAMountainArray;
import org.junit.jupiter.api.Test;

class PeakIndexInAMountainArrayTest {
    @Test
    void test() {
        PeakIndexInAMountainArray array = new PeakIndexInAMountainArray();
        System.out.println(array.peakIndexInMountainArray(new int[]{0, 1, 0}));
    }
}