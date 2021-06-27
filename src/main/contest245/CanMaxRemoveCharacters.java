package main.contest245;

public class CanMaxRemoveCharacters {
    public int maximumRemovals(String s, String p, int[] removable) {
        int rn = removable.length, sn = s.length();
        boolean[] delete = new boolean[sn];
        if (!isSub(s, p, delete)) {
            return 0;
        }
        for (int k = 0; k < rn; k++) {
            delete[removable[k]] = true;
            if (isInStr(s, p, removable[k])) {
                if (!isSub(s, p, delete)) {
                    return k;
                }
            }
        }
        return rn;
    }

    private boolean isSub(String s, String p, boolean[] delete) {
        int pn = p.length(), sn = s.length(), index = 0;
        for (int i = 0; i < sn; i++) {
            if (!delete[i] && s.charAt(i) == p.charAt(index)) {
                index++;
            }
            if (index == pn) {
                return true;
            }
        }
        return false;
    }

    private boolean isInStr(String s, String p, int delIndex) {
        for (char sc : p.toCharArray()) {
            if (sc == s.charAt(delIndex)) {
                return true;
            }
        }
        return false;
    }
}
