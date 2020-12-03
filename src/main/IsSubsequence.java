package main;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        return isSubsequence(s, t, 0, 0);
    }

    public boolean isSubsequence(String s, String t, int index, int start) {
        if (index >= s.length())
            return true;
        start = index(s.charAt(index), t, start);
        if (start == -1)
            return false;
        return isSubsequence(s, t, ++index, ++start);
    }

    public int index(char c, String t, int start) {
        for (int i = start; i < t.length(); i++) {
            if (t.charAt(i) == c)
                return i;
        }
        return -1;
    }
}
