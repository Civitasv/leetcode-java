package main;

/**
 * Count the number of prime numbers less than a non-negative number, n.
 */
public class CountPrimes {
    public int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) count++;
        }
        return count;
    }

    public boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Sieve of Eratosthenes
    public int countPrimes2(int n) {
        int count = 0;
        boolean[] isPrimes = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrimes[i] = true;
        }
        for (int i = 2; i * i < n; i++) {
            if (!isPrimes[i]) continue;
            for (int j = i * i; j < n; j += i) {
                isPrimes[j] = false;
            }
        }
        for (int i = 2; i < n; i++) {
            if (isPrimes[i]) count++;
        }
        return count;
    }
}
