package main.tag.hashtable.easy;

/**
 * 丢失的数字
 * <p>
 * 条件：
 * <p>
 * 1. n == nums.length
 * <p>
 * 2. 1 <= n <= 104
 * <p>
 * 3. 0 <= nums[i] <= n
 * <p>
 * 4. nums 中的所有数字都 独一无二
 * <p>
 * 思路：
 * <p>
 * nums中所有数字均独一无二，所以只需要定义一个长度为n+1的数组hash，若数字i存在，则令hash[i]--;
 * 循环数组nums后，若数字a不存在，则hash[a]=0，我们即可找到这个丢失的数字。
 * <p>
 * 进阶：你能否实现线性时间复杂度、仅使用额外常数空间的算法解决此问题?
 * <p>
 * 利用等差数列求和公式，假设数组长度为n，那么求和为(1+n) * n / 2，数组实际求和为 sum，那么二者相减显然为缺失的数。
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int[] hash = new int[nums.length + 1];
        for (int num : nums) {
            hash[num]--;
        }
        for (int i = 0, n = hash.length; i < n; i++) {
            if (hash[i] == 0) return i;
        }
        return -1;
    }

    public int missingNumberConstantSpace(int[] nums) {
        int sum = 0;
        for (int num : nums)
            sum += num;
        return (1 + nums.length) * nums.length / 2 - sum;
    }
}
