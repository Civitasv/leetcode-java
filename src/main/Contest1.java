package main;

import com.sun.org.apache.xpath.internal.functions.FuncFalse;

import java.util.Arrays;

public class Contest1 {
    public boolean canMakeArithmeticProgression(int[] arr) {
        boolean can = true;
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (diff != arr[i] - arr[i - 1]) {
                can = false;
                break;
            }
        }
        return can;
    }

    public int numSubmat(int[][] mat) {
        // 获得所有1*1
        int res = 0;
        int rowOne = 0, colOne = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1)
                    res++;
            }
        }
        // 逐行扫描
        for (int i = 0; i < mat.length; i++) {
            rowOne = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    rowOne++;
                } else {
                    if (rowOne > 1)
                        res += C(rowOne);
                    rowOne = 0;
                }
            }
        }
        return res;
    }

    public int C(int num) {
        if (num <= 1)
            return 0;
        return num * (num - 1) / 2;
    }

    public String minInteger(String num, int k) {
        char[] nums = num.toCharArray();
        int count = 0;
        // bubble sort
        for (int i = 1; i < nums.length; i++) {
            boolean flag = true;
            for (int j = 0; j < nums.length - i; j++) {
                if (charToInt(nums[j]) > charToInt(nums[j + 1])) {
                    char tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                    flag = false;
                    count++;
                }
                if (count > k) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                break;
            }
        }
        return String.valueOf(nums);
    }

    public int charToInt(char c) {
        return Character.getNumericValue(c);
    }
}
