package main.contest220;

/**
 * 重新格式化电话号码
 * <p>
 * 给你一个字符串形式的电话号码 number 。number 由数字、空格 ' '、和破折号 '-' 组成。
 * <p>
 * 请你按下述方式重新格式化电话号码。
 * <p>
 * 首先，删除 所有的空格和破折号。
 * 其次，将数组从左到右 每 3 个一组 分块，直到 剩下 4 个或更少数字。剩下的数字将按下述规定再分块：
 * 2 个数字：单个含 2 个数字的块。
 * 3 个数字：单个含 3 个数字的块。
 * 4 个数字：两个分别含 2 个数字的块。
 * 最后用破折号将这些块连接起来。注意，重新格式化过程中 不应该 生成仅含 1 个数字的块，并且 最多 生成两个含 2 个数字的块。
 * <p>
 * 返回格式化后的电话号码。
 */
public class ReformatPhone {
    public String reformatNumber(String number) {
        StringBuilder builder = new StringBuilder();
        number = number.replace(" ", "").replace("-", "");
        int n = number.length();
        if (n < 4) {
            return number;
        }
        int temp = 0;
        while (temp < n) {
            if (n - temp >= 5) {
                builder.append(number, temp, temp + 3).append("-");
                temp += 3;
            } else if (n - temp == 4) {
                builder.append(number, temp, temp + 2).append("-").append(number, temp + 2, temp + 4);
                temp += 4;
            } else if (n - temp == 3) {
                builder.append(number, temp, temp + 3);
                temp += 3;
            } else if (n - temp == 2) {
                builder.append(number, temp, temp + 2);
                temp += 2;
            }
        }
        return builder.toString();
    }
}
