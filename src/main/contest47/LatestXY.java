package main.contest47;

public class LatestXY {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int index = -1, distance = Integer.MAX_VALUE;
        for (int i = 0; i < points.length; i++) {
            int[] point = points[i];
            if (point[0] == x || point[1] == y) {
                int k = manHattan(x, y, point[0], point[1]);
                if (k < distance) {
                    index = i;
                    distance = k;
                }
            }
        }
        return index;
    }

    private int manHattan(int x1, int y1, int x2, int y2) {
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }
}
