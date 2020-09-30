package main;

/**
 * Given two binary strings, return their sum (also a binary string).
 */
public class AddBinary {
    /**
     * 数值溢出问题
     *
     * @param a
     * @param b
     * @return
     */
    public String addBinary(String a, String b) {
        int ab = str2int(a);
        int bb = str2int(b);

        int res = ab + bb;
        return int2str(res);
    }

    /**
     * 将二进制字符串转换为十进制数值
     *
     * @param str
     * @return
     */
    public int str2int(String str) {
        int sum = 0;
        int n = str.length();
        for (int i = n - 1; i >= 0; i--) {
            if (str.charAt(i) == '1') {
                sum += Math.pow(2, n - i - 1);
            }
        }
        return sum;
    }

    /**
     * 十进制数值转换为二进制字符串
     *
     * @param val
     * @return
     */
    public String int2str(int val) {
        StringBuilder res = new StringBuilder();
        int temp = 0;
        while (val != 0) {
            temp = val % 2;
            val = val / 2;
            res.insert(0, temp);
        }
        return res.toString();
    }


    /**
     * 按照数值运算规则进行计算
     *
     * @param a
     * @param b
     * @return
     */
    public String addBinary2(String a, String b) {
        if (a == null || a.isEmpty()) {
            return b;
        }
        if (b == null || b.isEmpty()) {
            return a;
        }
        StringBuilder res = new StringBuilder();
        int first = 0, second = 0, carry = 0;
        int i = a.length() - 1, j = b.length() - 1;
        while (i > -1 || j > -1 || carry == 1) {
            first = i > -1 ? Character.getNumericValue(a.charAt(i--)) : 0;
            second = j > -1 ? Character.getNumericValue(b.charAt(j--)) : 0;
            res.insert(0, first + second + carry >= 2 ? (first + second + carry - 2) : first + second + carry);
            carry = first + second + carry >= 2 ? 1 : 0;
        }
        return res.toString();
    }
}
