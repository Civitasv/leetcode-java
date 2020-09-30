package main;

public class LengthIOfLastWord {
    public int lengthOfLastWord(String s) {
        String ans = "";
        boolean empty = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                if (empty) {
                    ans = "";
                    empty = false;
                }
                ans += s.charAt(i);
            } else {
                empty = true;
            }
        }
        return ans.length();

    }

    public int lengthOfLastWord2(String s) {
        int res = 0;
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        while (i >= 0 && s.charAt(i) != ' ') {
            res++;
            i--;
        }
        return res;
    }
}
