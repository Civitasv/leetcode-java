package main;

public class PowerOfFour {
    public boolean isPowerOfFour(int num) {
        if (num < 1) return false;
        while (num != 1) {
            if (num % 4 != 0)
                return false;
            num /= 4;
        }
        return true;
    }

    // 0x55555555 is a hexametrical number，it is 1010101010101010101010101010101 in binary with a length of 32.
    // To make sure the 1 locates in the odd location.
    public boolean isPowerOfFour2(int num) {
        return num > 0 &&
                (num & (num - 1)) == 0 &&
                (num & 0x55555555) != 0;
    }
}
