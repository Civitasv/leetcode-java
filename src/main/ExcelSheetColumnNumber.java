package main;

/**
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 */
public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int sum = 0, n = s.length();
        for (int i = 0; i < n; i++) {
            sum += Math.pow(26, n - i - 1) * (s.charAt(i) - 64);
        }
        return sum;
    }
}
