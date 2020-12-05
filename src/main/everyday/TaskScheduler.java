package main.everyday;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        int[] task = new int[26];
        for (char c : tasks) {
            task[c - 'A']++;
        }
        Arrays.sort(task);
        int maxTimes = task[25];
        int maxCount = 1;
        for (int i = 25; i >= 1; i--) {
            if (task[i] == task[i - 1])
                maxCount++;
            else
                break;
        }
        return Math.max((maxTimes - 1) * (n + 1) + maxCount, tasks.length);
    }
}
