package main.everyday;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 验证二叉树的前序序列化
 * "9,3,4,#,#,1,#,#,2,#,6,#,#"
 */
public class VerifyPreorderSerializationOfABinaryTree {
    public boolean isValidSerialization(String preorder) {
        char[] pre = preorder.toCharArray();
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        int left = 0;
        while (left < pre.length) {
            if (stack.isEmpty()) return false;
            char c = pre[left];
            if (c != ',') {
                int top = stack.pop() - 1;
                if (top > 0) stack.push(top);
                if (c != '#') {
                    while (left < pre.length && pre[left] != ',')
                        left++;
                    stack.push(2);
                }
            }
            left++;
        }
        return stack.isEmpty();
    }
}
