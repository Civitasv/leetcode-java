package test;

import main.CountPrimes;
import org.junit.jupiter.api.Test;

class CountPrimesTest {

    @Test
    void test() {
        CountPrimes primes = new CountPrimes();
        System.out.println(primes.countPrimes2(499979));
    }

}