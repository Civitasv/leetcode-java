package main;

import java.util.Stack;

/**
 * Implement a basic calculator to evaluate a simple expression string.
 * <p>
 * The expression string contains only non-negative integers, +, -, *, / operators and empty spaces .
 * The integer division should truncate toward zero.
 */
public class BasicCalculatorII {
    public int calculate(String s) {
        int count = 0;
        Stack<Integer> result = new Stack<>();
        int num = 0;
        char sign = '+';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                // 如果是character
                num = num * 10 + c - '0';
            }
            if (!Character.isDigit(c) && c != ' ' || i == s.length() - 1) {
                if (sign == '+') {
                    result.add(num);
                }
                if (sign == '-') {
                    result.add(-num);
                }
                if (sign == '*') {
                    result.add(result.pop() * num);
                }
                if (sign == '/') {
                    result.add(result.pop() / num);
                }
                sign = c;
                num = 0;
            }
        }
        for (int i : result) {
            count += i;
        }
        return count;
    }
}
