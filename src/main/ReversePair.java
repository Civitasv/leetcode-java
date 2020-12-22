package main;

/**
 * 数组中的逆序对
 * <p>
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组，求出这个数组中的逆序对的总数。
 */
public class ReversePair {
    private int[] aux;

    public int reversePairs(int[] nums) { // 归并排序思想
        aux = new int[nums.length];
        return reversePairs(nums, 0, nums.length - 1);
    }

    private int reversePairs(int[] nums, int lo, int hi) {
        if (lo >= hi) return 0;
        int mid = lo + (hi - lo) / 2;
        return reversePairs(nums, lo, mid) + reversePairs(nums, mid + 1, hi) + merge(nums, lo, mid, hi);
    }

    private int merge(int[] nums, int lo, int mid, int hi) {
        int i = lo, j = mid + 1, count = 0;
        for (int k = lo; k <= hi; k++)
            aux[k] = nums[k];
        for (int k = lo; k <= hi; k++) {
            if (i > mid) nums[k] = aux[j++];
            else if (j > hi) nums[k] = aux[i++];
            else if (aux[i] <= aux[j]) nums[k] = aux[i++];
            else {
                nums[k] = aux[j++];
                count += mid - i + 1;
            }
        }
        return count;
    }
}
