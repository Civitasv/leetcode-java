package main.everyday;

public class Trie {
    private boolean isEnd;
    private final Trie[] next;

    /**
     * Initialize your data structure here.
     */
    public Trie() {
        isEnd = false;
        next = new Trie[26];
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        Trie trie = this;
        for (char c : word.toCharArray()) {
            if (trie.next[c - 'a'] == null)
                trie.next[c - 'a'] = new Trie();
            trie = trie.next[c - 'a'];
        }
        trie.isEnd = true;
    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
        Trie trie = this;
        for (char c : word.toCharArray()) {
            if (trie.next[c - 'a'] == null)
                return false;
            trie = trie.next[c - 'a'];
        }
        return trie.isEnd;
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        Trie trie = this;
        for (char c : prefix.toCharArray()) {
            if (trie.next[c - 'a'] == null)
                return false;
            trie = trie.next[c - 'a'];
        }
        return true;
    }
}
