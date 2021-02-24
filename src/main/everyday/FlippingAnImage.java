package main.everyday;

/**
 * 翻转图像
 */
public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int[] arr : A) {
            reverse(arr);
            for (int i = 0; i < arr.length; i++) {
                arr[i] = 1 - arr[i];
            }
        }
        return A;
    }

    private void reverse(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }
}
