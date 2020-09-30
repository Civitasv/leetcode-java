package test;


import main.PascalSTriangle;
import org.junit.jupiter.api.Test;

class PascalSTriangleTest {

    @Test
    void test() {
        PascalSTriangle pascalSTriangle = new PascalSTriangle();
        System.out.println(pascalSTriangle.generate(5));
        System.out.println(pascalSTriangle.getRow(3));
    }
}