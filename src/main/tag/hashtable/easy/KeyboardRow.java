package main.tag.hashtable.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.IntFunction;

/**
 * 键盘行
 * <p>
 * 思路：
 * 提前存储每一行字母的出现频率，循环每个单词即可
 */
public class KeyboardRow {
    public String[] findWords(String[] words) {
        String first = "qwertyuiop", second = "asdfghjkl", third = "zxcvbnm";
        int[] freqFirst = new int[26];
        int[] freqSecond = new int[26];
        int[] freqThird = new int[26];
        for (char c : first.toCharArray()) {
            freqFirst[c - 'a']++;
        }
        for (char c : second.toCharArray()) {
            freqSecond[c - 'a']++;
        }
        for (char c : third.toCharArray()) {
            freqThird[c - 'a']++;
        }
        List<String> res = new ArrayList<>();
        for (String word : words) {
            String lower = word.toLowerCase();
            if (contains(lower, freqFirst) || contains(lower, freqSecond) || contains(lower, freqThird))
                res.add(word);
        }
        String[] result = new String[res.size()];
        for (int i = 0, n = res.size(); i < n; i++)
            result[i] = res.get(i);
        return result;
    }

    private boolean contains(String a, int[] freq) {
        for (char c : a.toCharArray()) {
            if (freq[c - 'a'] <= 0) return false;
        }
        return true;
    }
}
