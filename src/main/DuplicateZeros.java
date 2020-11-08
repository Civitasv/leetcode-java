package main;

/**
 * Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.
 * <p>
 * Note that elements beyond the length of the original array are not written.
 * <p>
 * Do the above modifications to the input array in place, do not return anything from your function.
 */
public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                shiftToRight(arr, i + 1, arr.length - 1);
                arr[++i] = 0;
            }
        }
    }

    private void shiftToRight(int[] arr, int start, int end) {
        if (end - start >= 0) System.arraycopy(arr, start, arr, start + 1, end - start);
    }
}
