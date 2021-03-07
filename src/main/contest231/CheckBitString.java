package main.contest231;

public class CheckBitString {
    public boolean checkOnesSegment(String s) {
        int num = 0;
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '1') {
                num++;
                while (i < s.length() && s.charAt(i) == '1')
                    i++;
            }
            i++;
        }
        return num == 1;
    }
}
