package main.contest231;

public class LeastAddElement {
    public int minElements(int[] nums, int limit, int goal) {
        long sum = 0;
        for (int num : nums)
            sum += num;
        int count = 0;
        long need = Math.abs(goal - sum);
        if (need > limit) {
            long i = need / limit;
            count += i;
            need %= limit;
            if (need != 0)
                count++;
        } else if (need > 0) count++;
        return count;
    }
}
