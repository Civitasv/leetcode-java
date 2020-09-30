package main;

import java.util.Stack;

/**
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        digits[n - 1] += 1;
        while (n >= 2 && digits[n - 1] == 10) {
            digits[n - 1] = 0;
            digits[n - 1 - 1] += 1;
            n--;
        }
        if (digits[0] == 10) {
            int[] temp = new int[digits.length + 1];
            temp[0] = 1;
            return temp;
        } else {
            return digits;
        }
    }

    public int[] plusOne2(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] temp = new int[digits.length + 1];
        temp[0] = 1;
        return temp;
    }
}
