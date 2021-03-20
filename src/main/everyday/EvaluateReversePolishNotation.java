package main.everyday;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 逆波兰表达式求值
 */
public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Deque<String> stack = new ArrayDeque<>();
        for (String token : tokens) {
            if (stack.size() < 2) {
                stack.push(token);
                continue;
            }
            if ("+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token)) {
                int b = Integer.parseInt(stack.pop());
                int a = Integer.parseInt(stack.pop());
                if ("+".equals(token))
                    stack.push(String.valueOf(a + b));
                if ("-".equals(token))
                    stack.push(String.valueOf(a - b));
                if ("*".equals(token))
                    stack.push(String.valueOf(a * b));
                if ("/".equals(token))
                    stack.push(String.valueOf(a / b));
            }else stack.push(token);
        }
        return Integer.parseInt(stack.pop());
    }
}
