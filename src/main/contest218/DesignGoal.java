package main.contest218;

/**
 * 请你设计一个可以解释字符串 command 的 Goal 解析器
 * 。command 由 "G"、"()" 和/或 "(al)" 按某种顺序组成。
 * Goal 解析器会将 "G" 解释为字符串 "G"、"()" 解释为字符串 "o" ，
 * "(al)" 解释为字符串 "al" 。然后，按原顺序将经解释得到的字符串连接成一个字符串。
 * <p>
 * 给你字符串 command ，返回 Goal 解析器 对 command 的解释结果。
 */
public class DesignGoal {
    public String interpret(String command) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            char c = command.charAt(i);
            if (c == 'G')
                builder.append("G");
            if (c == '(') {
                if (command.charAt(i + 1) == ')') {
                    builder.append("o");
                    i++;
                } else {
                    builder.append("al");
                    i += 3;
                }
            }
        }
        return builder.toString();
    }
}
