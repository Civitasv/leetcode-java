package main;

/**
 * 爱生气的书店老板
 */
public class GrumpyBookstoreOwner {
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int n = customers.length;
        int right = X, customerNum = 0;
        for (int i = 0; i < n; i++) {
            if (i < X) {
                customerNum += customers[i];
            } else {
                if (grumpy[i] == 0) customerNum += customers[i];
            }
        }
        int max = customerNum;
        while (right < n) {
            int left = right - X;
            if (grumpy[right] == 1) customerNum += customers[right];
            if (grumpy[left] == 1) customerNum -= customers[left];
            right++;
            max = Math.max(max, customerNum);
        }
        return max;
    }
}
