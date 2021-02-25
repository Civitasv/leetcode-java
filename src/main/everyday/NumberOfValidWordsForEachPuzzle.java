package main.everyday;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 猜字谜
 */
public class NumberOfValidWordsForEachPuzzle {
    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
        Map<Integer, Integer> map = new HashMap<>();
        for (String word : words) {
            int mask = 0;
            for (int i = 0; i < word.length(); i++) {
                mask |= (1 << word.charAt(i) - 'a');
            }
            // 如果mask的1位数超过7，一定无法作为谜底
            if (Integer.bitCount(mask) <= 7)
                map.put(mask, map.getOrDefault(mask, 0) + 1);
        }
        List<Integer> result = new ArrayList<>();
        for (String puzzle : puzzles) {
            int total = 0;
            // 枚举，第一个字符不变，其它6个字符枚举，共2e6种
            for (int c = 0; c < (1 << 6); c++) {
                int mask = 0;
                for (int i = 0; i < 6; ++i) {
                    if ((c & (1 << i)) != 0) {
                        mask |= (1 << (puzzle.charAt(i + 1) - 'a'));
                    }
                }
                mask |= (1 << (puzzle.charAt(0) - 'a'));
                if (map.containsKey(mask)) {
                    total += map.get(mask);
                }
            }
            result.add(total);
        }
        return result;
    }
}
