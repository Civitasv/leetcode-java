package main;

/**
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
 */
public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        char[] alphabets = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
                'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
                'U', 'V', 'W', 'X', 'Y', 'Z'};
        if (n >= 1 && n <= 26) {
            return String.valueOf(alphabets[n - 1]);
        }
        StringBuilder res = new StringBuilder();
        while (n / 26 >= 1) {
            int i = n % 26;
            if (i == 0) {
                res.append(alphabets[25]);
                n -= 1;
            } else
                res.append(alphabets[i - 1]);
            n /= 26;
        }
        if (n > 0) res.append(alphabets[n - 1]);
        return res.reverse().toString();
    }
}
