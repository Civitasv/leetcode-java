package main;

/**
 * 有效的括号
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (res.length() == 0) {
                res.append(s.charAt(i));
                continue;
            }
            char c = s.charAt(i);
            char top = res.charAt(res.length() - 1);
            if ((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{')) {
                res.deleteCharAt(res.length() - 1);
            } else {
                res.append(c);
            }
        }
        return res.length() == 0;
    }
}
