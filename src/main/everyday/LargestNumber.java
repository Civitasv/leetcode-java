package main.everyday;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
    public String largestNumber(int[] nums) {
        Integer[] temp = new Integer[nums.length];
        boolean zero = true;
        for (int i = 0; i < nums.length; i++) {
            temp[i] = nums[i];
            if (nums[i] != 0)
                zero = false;
        }
        if (zero) return "0";

        Arrays.sort(temp, (o1, o2) -> {
            String first = String.valueOf(o1);
            String second = String.valueOf(o2);
            String f = first + second, s = second + first;
            for (int i = 0; i < f.length(); i++) {
                if (f.charAt(i) < s.charAt(i))
                    return 1;
                if (f.charAt(i) > s.charAt(i))
                    return -1;
            }
            return 0;
        });

        StringBuilder builder = new StringBuilder();
        for (int t : temp)
            builder.append(t);
        return builder.toString();
    }
}
