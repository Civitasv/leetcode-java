package main.everyday;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AddToArrayFormOfInteger {
    public List<Integer> addToArrayForm(int[] A, int K) {
        int bit = 0, index = A.length - 1; // 进位值
        List<Integer> res = new LinkedList<>();
        while (K > 0 && index >= 0) {
            int k = K % 10;
            int a = A[index];
            if (k + a + bit >= 10) {
                res.add(0, k + a + bit - 10);
                bit = 1;
            } else {
                res.add(0, k + a + bit);
                bit = 0;
            }
            K /= 10;
            index--;
        }
        while (K > 0) {
            int k = K % 10;
            if (k + bit == 10) {
                res.add(0, 0);
                bit = 1;
            } else {
                res.add(0, k + bit);
                bit = 0;
            }
            K /= 10;
        }
        while (index >= 0) {
            int a = A[index];
            if (a + bit == 10) {
                res.add(0, 0);
                bit = 1;
            } else {
                res.add(0, a + bit);
                bit = 0;
            }
            index--;
        }
        if (bit == 1) res.add(0, 1);
        return res;
    }
}
