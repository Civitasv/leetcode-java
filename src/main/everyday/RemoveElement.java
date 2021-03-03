package main.everyday;

/**
 * 移除元素
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int left = 0, right = 0;
        while (right < n) {
            if (nums[right] != val) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }
        return left;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
