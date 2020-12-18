package main.everyday;

import java.util.HashSet;
import java.util.Set;

/**
 * 找不同
 * 给定两个字符串 s 和 t，它们只包含小写字母。
 * <p>
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 * <p>
 * 请找出在 t 中被添加的字母。
 */
public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        char[] alphabets = new char[26];
        for (char c : s.toCharArray())
            alphabets[c - 'a']++;
        for (char c : t.toCharArray()) {
            if (alphabets[c - 'a'] > 0) alphabets[c - 'a']--;
            else return c;
        }
        return ' ';
    }

    /**
     * 使用异或运算可以解题主要因为异或运算有以下几个特点：
     * <p>
     * 一个数和0做XOR运算等于本身：a⊕0 = a
     * 一个数和其本身做XOR运算等于 0：a⊕a = 0
     * XOR 运算满足交换律和结合律：a⊕b⊕a = (a⊕a)⊕b = 0⊕b = b
     */
    public char findTheDifference2(String s, String t) {
        char ans = t.charAt(t.length() - 1);
        for (int i = 0; i < s.length(); i++) {
            ans ^= s.charAt(i);
            ans ^= t.charAt(i);
        }
        return ans;
    }
}
