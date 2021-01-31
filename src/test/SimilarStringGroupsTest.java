package test;

import main.everyday.SimilarStringGroups;
import org.junit.jupiter.api.Test;

class SimilarStringGroupsTest {

    @Test
    void test(){
        SimilarStringGroups groups = new SimilarStringGroups();
        System.out.println(groups.numSimilarGroups(new String[]{"abc","abc"}));
    }
}