package main;

/**
 * Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).
 * <p>
 * More formally check if there exists two indices i and j such that :
 * <p>
 * i != j
 * 0 <= i, j < arr.length
 * arr[i] == 2 * arr[j]
 */
public class CheckIfNAndItsDoubleExist {
    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int doubleNum = 2 * arr[i];
            if (exist(arr, doubleNum, i))
                return true;
        }
        return false;
    }

    public boolean exist(int[] arr, int num, int index) {
        for (int i = 0; i < arr.length; i++) {
            if (i != index && arr[i] == num) {
                return true;
            }
        }
        return false;
    }
}
