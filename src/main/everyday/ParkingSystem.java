package main.everyday;

/**
 * 设计停车系统
 */
public class ParkingSystem {

    private int b, m, s;

    public ParkingSystem(int big, int medium, int small) {
        b = big;
        m = medium;
        s = small;
    }

    public boolean addCar(int carType) {
        return (carType == 1 && b-- > 0) || (carType == 2 && m-- > 0) || (carType == 3 && s-- > 0);
    }
}