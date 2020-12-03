package test;

import main.everyday.LargestPerimeterTriangle;
import org.junit.jupiter.api.Test;

class LargestPerimeterTriangleTest {

    @Test
    void test(){
        LargestPerimeterTriangle triangle = new LargestPerimeterTriangle();
        System.out.println(triangle.largestPerimeter(new int[]{3,2,3,4}));
    }
}