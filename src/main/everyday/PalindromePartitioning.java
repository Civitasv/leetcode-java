package main.everyday;

import java.util.*;

/**
 * 分割回文串
 */
public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        backTrack(res, s, new ArrayDeque<>());
        return res;
    }

    private void backTrack(List<List<String>> res, String s, Deque<String> stack) {
        if (s.length() == 0) {
            res.add(new ArrayList<>(stack));
            return;
        }
        for (int i = 1; i <= s.length(); i++) {
            String pre = s.substring(0, i);
            if (isPalindrome(pre)) {
                stack.addLast(pre);
                backTrack(res, s.substring(i), stack);
                stack.removeLast();
            }
        }
    }

    private boolean isPalindrome(String s) {
        char[] c = s.toLowerCase().toCharArray();
        int lo = 0, hi = c.length - 1;
        while (lo < hi) {
            if (c[lo] != c[hi]) {
                return false;
            }
            lo++;
            hi--;
        }
        return true;
    }
}
