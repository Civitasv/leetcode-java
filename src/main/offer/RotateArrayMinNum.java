package main.offer;

/**
 * 旋转数组的最小数字
 *
 * @author Civitasv
 */
public class RotateArrayMinNum {
    // 普通遍历
    public int minArray(int[] numbers) {
        if (numbers == null || numbers.length == 0)
            return 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1])
                return numbers[i + 1];
        }
        return numbers[0];
    }

    // 二分法
    public int minArray2(int[] numbers) {
        int lo = 0, hi = numbers.length - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (numbers[mid] > numbers[hi]) {
                lo = mid + 1;
            } else if (numbers[mid] < numbers[hi]) {
                hi = mid;
            } else hi--;
        }
        return numbers[lo];
    }
}
