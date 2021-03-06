package main.contest47;

import java.util.*;

public class BeautyNum {
    public int beautySum(String s) {
        int n = s.length();
        int res = 0;
        for (int i = 0; i < n - 1; i++) {
            int[] hash = new int[26];
            hash[s.charAt(i) - 'a']++;
            for (int j = i + 1; j < n; j++) {
                hash[s.charAt(j) - 'a']++;
                int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
                for (int k = 0; k < 26; k++) {
                    if (hash[k] > 0) {
                        max = Math.max(hash[k], max);
                        min = Math.min(hash[k], min);
                    }
                }
                res += max - min;
            }
        }
        return res;
    }
}
