package test;

import main.BabyNames;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class BabyNamesTest {

    @Test
    void test() {
        BabyNames babyNames = new BabyNames();
        System.out.println(Arrays.toString(babyNames.trulyMostPopular(new String[]{"John(15)", "Jon(12)", "Chris(13)", "Kris(4)", "Christopher(19)"}, new String[]{"(Jon,John)", "(John,Johnny)", "(Chris,Kris)", "(Chris,Christopher)"})));
    }
}