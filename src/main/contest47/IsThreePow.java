package main.contest47;

import java.util.HashSet;
import java.util.Set;

public class IsThreePow {
    Set<Integer> set = new HashSet<>();

    public boolean checkPowersOfThree(int n) {
        if (n <= 0)
            return false;
        int i = 0;
        while (true) {
            int val = (int) Math.pow(3, i);
            if (val == n)
                return !set.contains(i);
            else if (val > n) {
                if (set.contains(i - 1)) return false;
                set.add(i - 1);
                return checkPowersOfThree((int) (n - Math.pow(3, i - 1)));
            } else i++;
        }
    }
}
