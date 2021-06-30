package main.tag.hashtable.easy;

/**
 * 赎金信
 * <p>
 * 构造大小为26的数组，对于magazine中的字符，统计出现的频率，然后循环ransom，对于ransom的每一个字符，出现一次，相当于使用一次对应字母，则freq数组相应位置减一
 * 循环结束后，若freq数组中存在小于0的数据，则说明magazine提供的字母不够，无法构成，否则可以构成。
 */
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];
        for (char c : magazine.toCharArray()) {
            freq[c - 'a']++;
        }
        for (char r : ransomNote.toCharArray()) {
            freq[r - 'a']--;
        }
        for (int num : freq) {
            if (num < 0) return false;
        }
        return true;
    }
}
