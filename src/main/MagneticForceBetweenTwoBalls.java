package main;

import java.util.Arrays;

/**
 * 两球之间的磁力
 */
public class MagneticForceBetweenTwoBalls {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n = position.length;
        int lo = 0, hi = position[n - 1] - position[0], res = 0;
        while (lo <= hi) {
            int maxDistance = lo + ((hi - lo) >> 1);
            int temp = m - 1;
            int pre = position[0];
            for (int i = 1; i < n; i++) {
                if (position[i] - pre >= maxDistance) {
                    pre = position[i];
                    temp--;
                }
            }
            if (temp <= 0) {
                lo = maxDistance + 1;
            } else hi = maxDistance - 1;
        }
        return lo - 1;
    }
}
