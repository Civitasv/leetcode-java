package main.offer;

/**
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 */
public class ReplaceEmptyPlace {
    public String replaceSpace(String s) {
        StringBuilder res = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                res.append("%20");
            } else res.append(c);
        }
        return res.toString();
    }
}
