package main.everyday;

import java.util.ArrayList;
import java.util.List;

/**
 * 将数组拆分成斐波那契序列
 * 给定一个数字字符串 S，比如 S = "123456579"，我们可以将它分成斐波那契式的序列 [123, 456, 579]。
 * <p>
 * 形式上，斐波那契式序列是一个非负整数列表 F，且满足：
 * <p>
 * 0 <= F[i] <= 2^31 - 1，（也就是说，每个整数都符合 32 位有符号整数类型）；
 * F.length >= 3；
 * 对于所有的0 <= i < F.length - 2，都有 F[i] + F[i+1] = F[i+2] 成立。
 * 另外，请注意，将字符串拆分成小块时，每个块的数字一定不要以零开头，除非这个块是数字 0 本身。
 * <p>
 * 返回从 S 拆分出来的任意一组斐波那契式的序列块，如果不能拆分则返回 []。
 */
public class SplitArrayIntoFibonacciSequence {
    public List<Integer> splitIntoFibonacci(String s) {
        List<Integer> res = new ArrayList<>();
        boolean isSuccess = backTrack(res, s, 0);
        return isSuccess ? res : new ArrayList<>();
    }

    private boolean backTrack(List<Integer> res, String s, int start) {
        if (start >= s.length()) {
            return res.size() > 2;
        }
        for (int i = start; i < s.length(); i++) {
            String substring = s.substring(start, i + 1);
            if (substring.length() > 1 && substring.charAt(0) == '0') {
                break;
            }
            int num;
            try {
                num = Integer.parseInt(substring);
            } catch (NumberFormatException e) {
                break;
            }
            int size = res.size();
            if (size >= 2) {
                if (num > res.get(size - 1) + res.get(size - 2)) {
                    break;
                }
            }
            if (size < 2 || num == res.get(size - 1) + res.get(size - 2)) {
                res.add(num);
                if (backTrack(res, s, i + 1)) {
                    return true;
                } else {
                    res.remove(res.size() - 1);
                }
            }
        }
        return false;
    }
}
