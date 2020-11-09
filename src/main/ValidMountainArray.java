package main;

/**
 * Given an array of integers arr, return true if and only if it is a valid mountain array.
 * <p>
 * Recall that arr is a mountain array if and only if:
 * <p>
 * arr.length >= 3
 * There exists some i with 0 < i < arr.length - 1 such that:
 * arr[0] < arr[1] < ... < arr[i - 1] < A[i]
 * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 */
public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3 || arr[0] >= arr[1]) {
            return false;
        }
        boolean up = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] < arr[i]) {
                up = false;
            }
            if (arr[i] < arr[i + 1] && !up) {
                return false;
            }
            if (arr[i] > arr[i + 1] && up) {
                return false;
            }
            if (arr[i] == arr[i + 1]) {
                return false;
            }
        }
        return !up;
    }
}
