package main.contest219;

public class LeastNum {
    public int minPartitions(String n) {
        int count = 0;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) - '0' > count) {
                count = n.charAt(i) - '0';
            }
        }
        return count;
    }
}
