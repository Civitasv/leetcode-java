package main;

/**
 * Given an array of integers A sorted in non-decreasing order,
 * return an array of the squares of each number, also in sorted non-decreasing order.
 */
public class SquaresOfASortedArraySolution {
    public int[] sortedSquares(int[] A) {
        int n = A.length;
        int[] square = new int[n];

        if (A[0] >= 0) {
            for (int i = 0; i < n; i++) {
                square[i] = A[i] * A[i];
            }
        } else if (A[n - 1] <= 0) {
            for (int i = 0; i < n; i++) {
                square[n - i - 1] = A[i] * A[i];
            }
        } else {
            int lo, hi, count = 0;
            for (int i = 0; i < n; i++) {
                if (A[i] <= 0 && A[i + 1] >= 0) {
                    lo = i;
                    hi = lo + 1;
                    while (lo >= 0 || hi < n) {
                        if (lo >= 0 && hi < n) {
                            if (A[lo] * A[lo] < A[hi] * A[hi]) {
                                square[count++] = A[lo] * A[lo];
                                lo--;
                            } else {
                                square[count++] = A[hi] * A[hi];
                                hi++;
                            }
                        } else if (lo >= 0) {
                            square[count++] = A[lo] * A[lo];
                            lo--;
                        } else {
                            square[count++] = A[hi] * A[hi];
                            hi++;
                        }
                    }
                    break;
                }
            }
        }

        return square;
    }
}
