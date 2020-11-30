package main.everyday;

import java.lang.reflect.Array;
import java.util.*;

/**
 * 给定一个字符串S，检查是否能重新排布其中的字母，使得两相邻的字符不同。
 * <p>
 * 若可行，输出任意可行的结果。若不可行，返回空字符串。
 * <p>
 * S 只包含小写字母并且长度在[1, 500]区间内。
 */
public class ReorganizeString {
    public String reorganizeString(String S) {
        StringBuilder res = new StringBuilder();
        int[] alphabets = new int[26];
        for (char c : S.toCharArray()) {
            alphabets[c - 'a']++;
        }
        List<Pair> pairs = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            if (alphabets[i] != 0)
                pairs.add(new Pair(alphabets[i], (char) ('a' + i)));
        }
        pairs.sort((o1, o2) -> o2.size - o1.size);
        int size = pairs.get(0).size;
        if (size > (S.length() + 1) / 2)
            return "";
        int position = 1;
        for (int i = 0; i < pairs.size(); i++) {
            Pair pair = pairs.get(i);
            for (int j = 0; j < pair.size; j++) {
                if (i == 0) {
                    res.append(pair.c);
                } else {
                    res.insert(position, pair.c);
                    position += 2;
                    if (position > res.length())
                        position = 1;
                }
            }
        }
        return res.toString();
    }

    public String reorganizeString2(String S) {
        StringBuilder res = new StringBuilder();
        int[] alphabets = new int[26];
        int max = 0;
        char maxChar = '\0';
        for (char c : S.toCharArray()) {
            alphabets[c - 'a']++;
            if (alphabets[c - 'a'] > max) {
                max = alphabets[c - 'a'];
                maxChar = c;
            }
        }
        if (max > (S.length() + 1) / 2)
            return "";
        for (int i = 0; i < max; i++) {
            res.append(maxChar);
        }
        int position = 1;
        for (int i = 0; i < 26; i++) {
            if (i == maxChar - 'a')
                continue;
            for (int j = 0; j < alphabets[i]; j++) {
                res.insert(position, (char) ('a' + i));
                position += 2;
                if (position > res.length())
                    position = 1;
            }
        }
        return res.toString();
    }

    public String reorganizeString3(String S) {
        if (S.length() < 2)
            return "";
        StringBuilder res = new StringBuilder();
        int[] alphabets = new int[26];
        int max = 0;
        for (char c : S.toCharArray()) {
            alphabets[c - 'a']++;
            if (alphabets[c - 'a'] > max) {
                max = alphabets[c - 'a'];
            }
        }
        if (max > (S.length() + 1) / 2)
            return "";
        PriorityQueue<Character> priorityQueue = new PriorityQueue<>((o1, o2) -> alphabets[o2 - 'a'] - alphabets[o1 - 'a']);
        for (int i = 0; i < 26; i++) {
            if (alphabets[i] != 0)
                priorityQueue.add((char) ('a' + i));
        }
        while (priorityQueue.size() > 1) {
            char c = priorityQueue.remove();
            char c2 = priorityQueue.remove();
            res.append(c).append(c2);
            if (--alphabets[c - 'a'] > 0) priorityQueue.add(c);
            if (--alphabets[c2 - 'a'] > 0) priorityQueue.add(c2);
        }
        if (priorityQueue.size() > 0) {
            res.append(priorityQueue.poll());
        }
        return res.toString();
    }
}

class Pair {
    int size;
    char c;

    Pair(int size, char c) {
        this.size = size;
        this.c = c;
    }
}
