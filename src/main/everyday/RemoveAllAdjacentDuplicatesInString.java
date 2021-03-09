package main.everyday;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 删除字符串中的所有相邻重复项
 */
public class RemoveAllAdjacentDuplicatesInString {
    public String removeDuplicates(String S) {
        int n = S.length();
        StringBuilder stack = new StringBuilder();
        int index = 0;
        while (index < n) {
            if (stack.length() != 0 && S.charAt(index) == stack.charAt(stack.length() - 1)) {
                while (stack.length() != 0 && S.charAt(index) == stack.charAt(stack.length() - 1)) {
                    stack.deleteCharAt(stack.length() - 1);
                }
            } else {
                stack.append(S.charAt(index));
            }
            index++;
        }
        return stack.toString();
    }
}
