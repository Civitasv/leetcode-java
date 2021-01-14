package main.everyday;

import java.util.ArrayList;
import java.util.List;

/**
 * 可被 5 整除的二进制前缀
 */
public class BinaryPrefixDivisibleBy5 {
    public List<Boolean> prefixesDivBy5(int[] A) {
        if (A.length == 0)
            return new ArrayList<>();
        List<Boolean> res = new ArrayList<>();
        int mod = 0;
        for (int a : A) {
            mod = (2 * mod + a) % 5;
            res.add(mod == 0);
        }
        return res;
    }
}
