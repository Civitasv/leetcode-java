package main.everyday;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        // result = tasks.length + idle
        // idle = empty slots - (n - maxTimes * maxFrequency)

        int[] frequency = new int[26];
        int maxFrequency = 0;
        int maxTimes = 1;

        for (char task : tasks) {
            frequency[task - 'A']++;
            if (frequency[task - 'A'] == maxFrequency)
                maxTimes++;
            if (frequency[task - 'A'] > maxFrequency) {
                maxFrequency = frequency[task - 'A'];
                maxTimes = 1;
            }
        }

        int idle = Math.max(0, (maxFrequency - 1) * (n - maxTimes + 1) - (tasks.length - maxTimes * maxFrequency));
        return tasks.length + idle;
    }
}
