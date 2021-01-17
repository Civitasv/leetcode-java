package main.everyday;

public class CheckIfItIsAStraightLine {
    public boolean checkStraightLine(int[][] coordinates) {
        // 检测x或y是否完全相同
        if (hasSameX(coordinates) || hasSameY(coordinates))
            return true;
        float k = calK(coordinates[0], coordinates[1]);
        for (int i = 1; i < coordinates.length - 1; i++) {
            if (calK(coordinates[i + 1], coordinates[i]) != k)
                return false;
        }
        return true;
    }

    private float calK(int[] a, int[] b) {
        return (b[1] - a[1]) / ((b[0] - a[0]) * 1.0f);
    }

    private boolean hasSameX(int[][] coordinates) {
        for (int i = 0; i < coordinates.length - 1; i++) {
            if (coordinates[i + 1][0] != coordinates[i][0])
                return false;
        }
        return true;
    }

    private boolean hasSameY(int[][] coordinates) {
        for (int i = 0; i < coordinates.length - 1; i++) {
            if (coordinates[i + 1][1] != coordinates[i][1])
                return false;
        }
        return true;
    }
}
