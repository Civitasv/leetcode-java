package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 婴儿名字
 * 每年，政府都会公布一万个最常见的婴儿名字和它们出现的频率，也就是同名婴儿的数量。
 * 有些名字有多种拼法，例如，John 和 Jon 本质上是相同的名字，但被当成了两个名字公布出来。
 * 给定两个列表，一个是名字及对应的频率，另一个是本质相同的名字对。
 * 设计一个算法打印出每个真实名字的实际频率。
 * 注意，如果 John 和 Jon 是相同的，并且 Jon 和 Johnny 相同，则 John 与 Johnny 也相同，即它们有传递和对称性。
 * <p>
 * 在结果列表中，选择字典序最小的名字作为真实名字。
 */
public class BabyNames {
    public String[] trulyMostPopular(String[] names, String[] synonyms) {
        Map<String, Integer> namesMap = parseNames(names);
        Map<String, String> synonymsMap = parseSynonyms(synonyms);
        for (String baby : namesMap.keySet()) {
            int val = namesMap.get(baby);
            String temp = baby;
            while (synonymsMap.containsKey(temp)) {
                String str = synonymsMap.get(temp);
                val += namesMap.get(str);
                namesMap.remove(str);
                synonymsMap.remove(temp);
                temp = str;
            }
            namesMap.put(baby, val);
        }
        List<String> list = new ArrayList<>();
        for (String baby : namesMap.keySet()) {
            list.add(baby + "(" + namesMap.get(baby) + ")");
        }
        String[] res = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    private Map<String, Integer> parseNames(String[] names) {
        Map<String, Integer> map = new HashMap<>();
        for (String name : names) {
            int end = 0;
            while (end++ < name.length()) {
                if (name.charAt(end) == '(')
                    break;
            }
            map.put(name.substring(0, end), Integer.parseInt(name.substring(end + 1, name.length() - 1)));
        }
        return map;
    }

    private Map<String, String> parseSynonyms(String[] synonyms) {
        Map<String, String> map = new HashMap<>();
        for (String synonym : synonyms) {
            int mid = 0;
            while (mid++ < synonym.length()) {
                if (synonym.charAt(mid) == ',')
                    break;
            }
            map.put(synonym.substring(1, mid), synonym.substring(mid + 1, synonym.length() - 1));
            map.put(synonym.substring(mid + 1, synonym.length() - 1), synonym.substring(1, mid));
        }
        return map;
    }
}