package main;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        // 回溯法
        List<String> reslut = new ArrayList<>();
        backTrack(reslut, "", 0, 0, n);
        return reslut;
    }

    public void backTrack(List<String> result, String ans, int left, int right, int n) {
        // 退出循环条件
        if (ans.length() == n * 2) {
            result.add(ans);
            return;
        }
        if (left < n) {
            backTrack(result, ans + "(", left + 1, right, n);
        }
        if (right < left) {
            backTrack(result, ans + ")", left, right + 1, n);
        }
    }
}
