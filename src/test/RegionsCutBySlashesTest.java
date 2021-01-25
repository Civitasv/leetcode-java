package test;

import main.everyday.RegionsCutBySlashes;
import org.junit.jupiter.api.Test;

class RegionsCutBySlashesTest {

    @Test
    void test() {
        RegionsCutBySlashes regionsCutBySlashes = new RegionsCutBySlashes();
        System.out.println(regionsCutBySlashes.regionsBySlashes(new String[]{"/\\", "\\/"}));
    }
}