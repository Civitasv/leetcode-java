package main.everyday;

/**
 * 相似字符串组
 */
public class SimilarStringGroups {
    public int numSimilarGroups(String[] strs) {
        UnionFind uf = new UnionFind(strs.length);
        for (int i = 0; i < strs.length - 1; i++) {
            for (int j = i + 1; j < strs.length; j++) {
                if (!uf.isConnected(i, j) && isAnagram(strs[i], strs[j])) {
                    uf.union(i, j);
                }
            }
        }
        int count = 0;
        for (int i = 0; i < strs.length; i++) {
            if (uf.find(i) == i) count++;
        }
        return count;
    }

    private boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        if (a.equals(b)) return true;
        int start = -1, end = -1, count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                count++;
                if (count == 1) start = i;
                else end = i;
            }
        }
        if (count != 2)
            return false;
        else {
            return a.charAt(start) == b.charAt(end) && a.charAt(end) == b.charAt(start);
        }
    }

    static class UnionFind {
        private final int[] father;

        public UnionFind(int n) {
            this.father = new int[n];
            for (int i = 0; i < n; i++) {
                father[i] = i;
            }
        }

        public void union(int i, int j) {
            father[find(i)] = find(j);
        }

        public int find(int i) {
            if (father[i] == i)
                return i;
            else {
                father[i] = find(father[i]);
                return father[i];
            }
        }

        public boolean isConnected(int i, int j) {
            return find(i) == find(j);
        }
    }
}
