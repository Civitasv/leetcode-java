package main;

public class NumberOf1Bits {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        String bs = to2(n);
        for (int i = 0; i < bs.length(); i++) {
            if (bs.charAt(i) == '1')
            if (bs.charAt(i) == '1')
                count++;
        }
        return count;
    }

    public String to2(int n) {
        return Integer.toBinaryString(n);
    }
}
