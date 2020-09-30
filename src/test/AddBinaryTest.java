package test;


import main.AddBinary;
import org.junit.jupiter.api.Test;

class AddBinaryTest {

    @Test
    public void test() {
        AddBinary addBinary = new AddBinary();
        System.out.println(addBinary.addBinary2("1010", "1011"));
    }
}