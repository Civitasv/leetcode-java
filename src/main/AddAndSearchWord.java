package main;

public class AddAndSearchWord {
    private TrieNode root;

    /**
     * Initialize your data structure here.
     */
    public AddAndSearchWord() {
        root = new TrieNode();
    }

    /**
     * Adds a word into the data structure.
     */
    public void addWord(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);
            if (!node.containsKey(current)) {
                node.put(current, new TrieNode());
            }
            node = node.get(current);
        }
        node.setEnd();
    }

    /**
     * Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter.
     */
    public boolean search(String word) {
        TrieNode node = search(0, word, root);
        return node != null && node.isEnd();
    }


    public TrieNode search(int lo, String word, TrieNode node) {
        for (int i = lo; i < word.length(); i++) {
            char current = word.charAt(i);
            if (current == '.') {
                for (char j = 'a'; j <= 'z'; j++) {
                    TrieNode temp = node;
                    if (temp.containsKey(j)) {
                        temp = temp.get(j);
                        if ((temp = search(i + 1, word, temp)) != null) {
                            if (temp.isEnd())
                                return temp;
                        }
                    }
                }
                return null;
            } else if (node.containsKey(current)) {
                node = node.get(current);
            } else {
                return null;
            }
        }
        return node;
    }

    /**
     * Maximum of RR links to its children,
     * where each link corresponds to one of R character values from dataset alphabet.
     * <p>
     * In this article we assume that R is 26, the number of lowercase latin letters.
     * <p>
     * Boolean field which specifies whether the node corresponds to the end of the key, or is just a key prefix.
     */
    private class TrieNode {

        // R links to node children
        private TrieNode[] links;

        private final int R = 26;

        private boolean isEnd;

        public TrieNode() {
            links = new TrieNode[R];
        }

        public boolean containsKey(char ch) {
            return links[ch - 'a'] != null;
        }

        public TrieNode get(char ch) {
            return links[ch - 'a'];
        }

        public void put(char ch, TrieNode node) {
            links[ch - 'a'] = node;
        }

        public void setEnd() {
            isEnd = true;
        }

        public boolean isEnd() {
            return isEnd;
        }
    }
}
