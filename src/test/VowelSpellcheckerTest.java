package test;

import main.VowelSpellchecker;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class VowelSpellcheckerTest {

    @Test
    void test() {
        VowelSpellchecker spellchecker = new VowelSpellchecker();
        System.out.println(Arrays.toString(spellchecker.spellchecker(new String[]{"KiTe", "kite", "hare", "Hare"}, new String[]{"kite", "Kite", "KiTe", "Hare", "HARE", "Hear", "hear", "keti", "keet", "keto"})));
    }
}