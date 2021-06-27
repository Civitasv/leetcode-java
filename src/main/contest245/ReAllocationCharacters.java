package main.contest245;

import java.util.Arrays;

public class ReAllocationCharacters {
    public boolean makeEqual(String[] words) {
        int[] alphabets = new int[26];
        int n = words.length;
        Arrays.stream(words).forEach(word -> {
            for (char c : word.toCharArray()) {
                alphabets[c - 'a']++;
            }
        });
        for (int num : alphabets) {
            if (num % n != 0)
                return false;
        }
        return true;
    }
}
