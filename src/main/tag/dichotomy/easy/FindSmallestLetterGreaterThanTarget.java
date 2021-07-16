package main.tag.dichotomy.easy;

/**
 * 寻找比目标字母大的最小字母
 */
public class FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        int lo = 0, hi = letters.length - 1;
        while (lo <= hi) {
            int mid = lo + ((hi - lo) >> 1);
            if (letters[mid] <= target) {
                lo = mid + 1;
            } else hi = mid - 1;
        }
        return letters[lo > letters.length - 1 ? 0 : lo];
    }
}
