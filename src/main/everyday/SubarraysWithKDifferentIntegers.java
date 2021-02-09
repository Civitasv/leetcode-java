package main.everyday;

/**
 * K 个不同整数的子数组
 */
public class SubarraysWithKDifferentIntegers {
    public int subarraysWithKDistinct(int[] A, int K) {
        return atMostK(A, K) - atMostK(A, K - 1);
    }

    private int atMostK(int[] A, int K) {
        int n = A.length;
        int left = 0, right = 0, nums = 0, count = 0;
        int[] freq = new int[n + 1]; //  表示每个字符出现的频率
        while (right < n) {
            if (freq[A[right]] == 0)
                count++;
            freq[A[right]]++;
            while (count > K) {
                freq[A[left]]--;
                if (freq[A[left]] == 0)
                    count--;
                left++;
            }
            nums += right - left + 1;
            right++;
        }
        return nums;
    }
}
