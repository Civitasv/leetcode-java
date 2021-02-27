package main.everyday;

/**
 * 单调数列
 */
public class MonotonicArray {
    public boolean isMonotonic(int[] A) {
        if (A.length == 1)
            return true;
        boolean down = true;
        boolean up = true;
        for (int i = 0; i < A.length - 1; i++) {
            down = down && (A[i + 1] >= A[i]);
            up = up && (A[i + 1] <= A[i]);
        }
        return down || up;
    }
}
