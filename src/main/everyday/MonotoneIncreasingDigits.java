package main.everyday;

public class MonotoneIncreasingDigits {
    public int monotoneIncreasingDigits(int N) {
        int[] digits = digits(N);
        int res = 0, size = digits.length;
        for (int i = size - 1; i > 0; i--) {
            int lo = digits[i], hi = digits[i - 1];
            if (hi > lo) {
                digits[i - 1]--;
                for (int j = i; j < size; j++) {
                    digits[j] = 9;
                }
            }
        }
        for (int i = size - 1; i >= 0; i--) {
            res += (digits[i] * Math.pow(10, size - 1 - i));
        }
        return res;
    }

    private int[] digits(int N) {
        int size = String.valueOf(N).length();
        int[] digits = new int[size];
        while (N != 0) {
            digits[--size] = N % 10;
            N /= 10;
        }
        return digits;
    }
}