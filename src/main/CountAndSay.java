package main;

public class CountAndSay {
    /**
     * 暴力解法
     *
     * @param n
     * @return
     */
    public String countAndSay(int n) {
        int frequence = 1, lo = 0, hi = 1;
        String res = "1";
        String temp = "", previous = "";
        for (int i = 1; i < n; i++) {
            while (lo < res.length()) {
                previous = res.substring(lo, lo + 1);
                if (hi < res.length() && res.substring(hi, hi + 1).equals(previous)) {
                    frequence++;
                    hi++;
                } else {
                    lo = hi;
                    hi++;
                    temp = temp + frequence + previous;
                    frequence = 1;
                }
            }
            frequence = 1;
            res = temp;
            temp = "";
            lo = 0;
            hi = 1;
        }
        return res;
    }

    /**
     * 递归
     *
     * @param n
     * @return
     */
    public String countAndSay2(int n) {
        if (n == 1)
            return "1";
        String previousString = countAndSay2(n - 1);
        String nextString = getNextString(previousString);
        return nextString;
    }


    public String getNextString(String previous) {
        char current = previous.charAt(0);
        StringBuilder stringBuilder = new StringBuilder();
        int frequence = 1;
        for (int i = 1; i < previous.length(); i++) {
            if (previous.charAt(i) == current) {
                frequence++;
            } else {
                stringBuilder.append(frequence).append(current);
                frequence = 1;
                current = previous.charAt(i);
            }
        }
        stringBuilder.append(frequence).append(current);
        return stringBuilder.toString();
    }
}
