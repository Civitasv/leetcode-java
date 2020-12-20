package main.everyday;

import java.util.Stack;

/**
 * 去除重复字母
 * <p>
 * 给你一个字符串 s ，请你去除字符串中重复的字母，使得每个字母只出现一次。需保证 返回结果的字典序最小（要求不能打乱其他字符的相对位置）。
 */
public class RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        boolean[] view = new boolean[26]; // 记录该字母是否已经在栈中
        int[] nums = new int[26]; // 记录每个字母剩余的个数, 因为弹出栈的时候需保证不低于1
        for (char c : s.toCharArray()) {
            nums[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (view[c - 'a']) {
                nums[c - 'a']--;
                continue;
            }
            while (!stack.isEmpty() && stack.peek() > c && nums[stack.peek() - 'a'] > 1) { // 栈越向下越小越好
                nums[stack.peek() - 'a']--;
                view[stack.peek() - 'a'] = false;
                stack.pop();
            }
            stack.push(c);
            view[c - 'a'] = true;
        }
        StringBuilder builder = new StringBuilder();
        for (char c : stack) {
            builder.append(c);
        }
        return builder.toString();
    }
}
