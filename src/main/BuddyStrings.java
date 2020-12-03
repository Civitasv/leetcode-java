package main;

import java.util.HashSet;
import java.util.Set;

public class BuddyStrings {
    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) return false;
        if ("".equals(A)) return false;
        if (A.equals(B)) {
            Set<Character> characterSet = new HashSet<>();
            for (int i = 0; i < A.length(); i++) {
                char a = A.charAt(i);
                if (characterSet.contains(a))
                    return true;
                else characterSet.add(a);
            }
        }
        char ac = 0, bc = 0;
        int count = 0;
        boolean result = false;

        for (int i = 0; i < A.length(); i++) {
            char a = A.charAt(i);
            char b = B.charAt(i);
            if (a != b) {
                count++;
                if (ac == 0 || bc == 0) {
                    ac = a;
                    bc = b;
                } else {
                    if (ac == b && bc == a) {
                        result = true;
                    }
                }
            }
        }
        return result && count == 2;
    }
}
