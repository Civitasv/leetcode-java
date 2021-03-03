package main;

/**
 * 子矩形查询
 */
public class SubrectangleQueries {
    private final int[][] rectangle;
    private final int[][] history;
    private int count; // 更新次数

    public SubrectangleQueries(int[][] rectangle) {
        this.rectangle = rectangle;
        this.history = new int[500][5];
        this.count = 0;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        history[count++] = new int[]{row1, col1, row2, col2, newValue}; // 增加历史记录
    }

    public int getValue(int row, int col) {
        for (int i = count - 1; i >= 0; i--) {
            int[] data = history[i];
            if (row >= data[0] && row <= data[2] && col >= data[1] && col <= data[3])
                return data[4];
        }
        return rectangle[row][col];
    }
}
