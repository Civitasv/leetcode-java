package main.everyday;

public class IncreasingDecreasingString {
    public String sortString(String s) {
        StringBuilder res = new StringBuilder();
        int[] frequency = new int[26];
        for (char c : s.toCharArray()) {
            frequency[c - 'a']++;
        }
        while (!isEmpty(frequency)) {
            for (char c = 'a'; c <= 'z'; c++) {
                if (frequency[c - 'a'] != 0) {
                    res.append(c);
                    frequency[c - 'a']--;
                }
            }
            for (char c = 'z'; c >= 'a'; c--) {
                if (frequency[c - 'a'] != 0) {
                    res.append(c);
                    frequency[c - 'a']--;
                }
            }
        }
        return res.toString();
    }

    public boolean isEmpty(int[] frequency) {
        for (int i : frequency)
            if (i != 0)
                return false;
        return true;
    }
}
