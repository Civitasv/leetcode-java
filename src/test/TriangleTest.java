package test;

import main.Triangle;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class TriangleTest {
    @Test
    void test() {
        Triangle triangle = new Triangle();
        List<List<Integer>> triangles = new ArrayList<>();
        triangles.add(new ArrayList<>(Collections.singletonList(2)));
        triangles.add(new ArrayList<>(Arrays.asList(3, 4)));
        triangles.add(new ArrayList<>(Arrays.asList(6, 5, 7)));
        triangles.add(new ArrayList<>(Arrays.asList(4, 1, 8, 3)));
        System.out.println(triangle.minimumTotal(triangles));
    }
}