package test;

import main.contest222.TruckUnits;
import org.junit.jupiter.api.Test;

class TruckUnitsTest {

    @Test
    void test() {
        TruckUnits units = new TruckUnits();
        System.out.println(units.maximumUnits(new int[][]{{5, 10}}, 10));
    }
}