package main;

import main.contest219.PebbleGame;

import java.util.*;

/**
 * 元音拼写检查器
 */
public class VowelSpellchecker {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        String[] res = new String[queries.length];
        Set<String> set = new HashSet<>();
        Map<String, String> mapLow = new HashMap<>(); // 存放小写
        Map<String, String> mapVowel = new HashMap<>(); // 存放去除元音小写
        for (String word : wordlist) {
            set.add(word);
            String wordLowCase = word.toLowerCase();
            if (!mapLow.containsKey(wordLowCase))
                mapLow.put(wordLowCase, word);
            String deVowel = deVowel(wordLowCase);
            if (!mapVowel.containsKey(deVowel))
                mapVowel.put(deVowel, word);
        }

        for (int i = 0; i < queries.length; i++) {
            String query = queries[i];
            if (set.contains(query)) {
                res[i] = query;
            } else if (mapLow.containsKey(query.toLowerCase())) {
                res[i] = mapLow.get(query.toLowerCase());
            } else res[i] = mapVowel.getOrDefault(deVowel(query.toLowerCase()), "");
        }
        return res;
    }

    private String deVowel(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : str.toCharArray()) {
            stringBuilder.append(isVowel(c) ? '*' : c);
        }
        return stringBuilder.toString();
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i'
                || c == 'o' || c == 'u';
    }
}
