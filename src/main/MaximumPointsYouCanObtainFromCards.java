package main;

/**
 * 可获得的最大点数
 */
public class MaximumPointsYouCanObtainFromCards {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        int n = cardPoints.length, len = n - k, right = len, cards = 0;
        for (int i = 0; i < n; i++) {
            if (i < right) cards += cardPoints[i];
            sum += cardPoints[i];
        }
        int min = cards;
        while (right < n) {
            int left = right - len;
            cards += cardPoints[right];
            cards -= cardPoints[left];
            min = Math.min(min, cards);
            right++;
        }
        return sum - min;
    }
}
