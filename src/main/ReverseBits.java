package main;

/**
 * Reverse bits of a given 32 bits unsigned integer.
 */
public class ReverseBits {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        StringBuilder stringBuilder = new StringBuilder(to2(n));
        System.out.println(to2(n));
        return to10(stringBuilder.reverse().toString());
    }

    public String to2(int n) {
        StringBuilder binaryStr = new StringBuilder(Integer.toBinaryString(n));
        while (binaryStr.length() < 32) {
            binaryStr.insert(0, "0");
        }
        return binaryStr.toString();
    }

    public int to10(String str) {
        // 将其当作有符号解析
        return Integer.parseUnsignedInt(str, 2);
    }
}
