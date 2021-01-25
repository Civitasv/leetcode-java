package main;

/**
 * 存在连续三个奇数的数组
 * 给你一个整数数组 arr，请你判断数组中是否存在连续三个元素都是奇数的情况：如果存在，请返回 true ；否则，返回 false 。
 */
public class ThreeConsecutiveOdds {
    public boolean threeConsecutiveOdds(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            boolean isOdd = true;
            for (int k = 0; k < 3; k++)
                if (!isOdd(arr[i + k])) {
                    isOdd = false;
                    break;
                }
            if (isOdd) return true;
        }
        return false;
    }

    private boolean isOdd(int a) {
        return a % 2 != 0;
    }
}
