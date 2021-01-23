package main.everyday;

/**
 * 连通网络的操作次数
 */
public class NumberOfOperationsToMakeNetworkConnected {
    public int makeConnected(int n, int[][] connections) {
        UnionFind uf = new UnionFind(n);
        int count = 0; // 冗余电缆
        for (int[] connection : connections) {
            int a = uf.find(connection[0]), b = uf.find(connection[1]);
            if (a == b) count++;
            else uf.union(connection[0], connection[1]);
        }
        int res = 0;
        int a = uf.find(0);
        for (int i = 1; i < n; i++) {
            int fa = uf.find(i);
            if (a != fa) {
                if (count == 0) return -1;
                else {
                    res++;
                    count--;
                    uf.union(0, i);
                    a = uf.find(0);
                }
            }
        }
        return res;
    }

    static class UnionFind {
        private final int[] father;

        public UnionFind(int n) {
            this.father = new int[n];
            for (int i = 0; i < n; i++)
                father[i] = i;
        }

        public void union(int a, int b) {
            father[find(a)] = find(b);
        }

        public int find(int i) {
            if (father[i] == i)
                return father[i];
            else {
                father[i] = find(father[i]);
                return father[i];
            }
        }
    }
}