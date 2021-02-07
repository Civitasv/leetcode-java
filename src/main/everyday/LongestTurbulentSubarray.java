package main.everyday;

/**
 * 最长湍流子数组
 */
public class LongestTurbulentSubarray {
    public int maxTurbulenceSize(int[] arr) {
        if (arr.length == 1)
            return 1;
        int n = arr.length;
        int left = 0, right = 1, maxLen = 1;
        int status;
        if (arr[0] < arr[1])
            status = 1; // 上升
        else if (arr[0] > arr[1])
            status = 0; // 下降
        else {
            status = -1; // 相等
            left = 1;
        }
        while (right < n - 1) {
            if (arr[right] < arr[right + 1]) {
                if (status == 1) {
                    maxLen = Math.max(maxLen, right - left + 1);
                    left = right;
                }
                status = 1;
            } else if (arr[right] > arr[right + 1]) {
                if (status == 0) {
                    maxLen = Math.max(maxLen, right - left + 1);
                    left = right;
                }
                status = 0;
            } else {
                maxLen = Math.max(maxLen, right - left + 1);
                left = right + 1;
                status = -1;
            }
            right++;
        }
        maxLen = Math.max(maxLen, right - left + 1);
        return maxLen;
    }
}
