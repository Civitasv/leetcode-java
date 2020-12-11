package test;

import main.everyday.Dota2Senate;
import org.junit.jupiter.api.Test;

class Dota2SenateTest {

    @Test
    void test(){
        Dota2Senate senate = new Dota2Senate();
        System.out.println(senate.predictPartyVictory("DRRDRDRDRDDRDRDR"));
    }
}