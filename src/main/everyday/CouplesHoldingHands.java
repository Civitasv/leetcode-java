package main.everyday;

/**
 * 情侣牵手
 */
public class CouplesHoldingHands {
    public int minSwapsCouples(int[] row) {
        int n = row.length; // 座位数
        int swap = 0;
        for (int i = 0; i < n; i += 2) {
            int val = row[i];
            int x, couple;
            if (val % 2 == 0) {
                x = (val + 2) / 2;
                couple = 2 * x - 1;
            } else {
                x = (val + 1) / 2;
                couple = 2 * x - 2;
            }
            if (row[i + 1] != couple) {
                exc(row, i + 1, index(row, couple));
                swap++;
            }
        }
        return swap;
    }

    private int index(int[] row, int val) {
        for (int i = 0; i < row.length; i++) {
            if (val == row[i])
                return i;
        }
        return -1;
    }

    private void exc(int[] row, int x, int y) {
        int temp = row[x];
        row[x] = row[y];
        row[y] = temp;
    }
}
