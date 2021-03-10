package main.everyday;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 基本计算器
 * s 由数字、'+'、'-'、'('、')'、和 ' ' 组成
 * (12+(42+5+2)-3)+(6+8)
 */
public class BasicCalculator {
    public int calculate(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        int num = 0, res = 0;
        int operator = 1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') continue;
            if (Character.isDigit(c)) {
                // 如果是数字
                num = num * 10 + c - '0';
            } else {
                if (c == '(') {
                    // 计算括号里的
                    stack.push(res);
                    stack.push(operator);
                    res = 0;
                    operator = 1;
                } else if (c == ')') {
                    // 括号计算完毕
                    res += operator * num;
                    num = 0;
                    res *= stack.pop();
                    res += stack.pop();
                } else if (c == '+') {
                    res += operator * num;
                    operator = 1;
                    num = 0;
                } else if (c == '-') {
                    res += operator * num;
                    operator = -1;
                    num = 0;
                }
            }
        }
        return res + operator * num;
    }
}
