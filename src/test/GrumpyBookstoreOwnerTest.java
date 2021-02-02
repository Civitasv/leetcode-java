package test;

import main.GrumpyBookstoreOwner;
import org.junit.jupiter.api.Test;

class GrumpyBookstoreOwnerTest {

    @Test
    void test() {
        GrumpyBookstoreOwner owner = new GrumpyBookstoreOwner();
        System.out.println(owner.maxSatisfied(new int[]{1, 0, 1, 2, 1, 1, 7, 5}, new int[]{0, 1, 0, 1, 0, 1, 0, 1}, 3));
    }
}