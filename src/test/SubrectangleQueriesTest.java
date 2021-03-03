package test;

import main.SubrectangleQueries;
import org.junit.jupiter.api.Test;

class SubrectangleQueriesTest {

    @Test
    void test() {
        SubrectangleQueries queries = new SubrectangleQueries(new int[][]{{1, 2, 1}, {4, 3, 4}, {3, 2, 1}, {1, 1, 1}});
        System.out.println(queries.getValue(0, 2));
        queries.updateSubrectangle(0, 0, 3, 2, 5);
        System.out.println(queries.getValue(0, 2));
        System.out.println(queries.getValue(3, 1));
    }
}