package main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.ToIntFunction;

public class NumberOfRecentCalls {

    private final List<Integer> pings; // 时间

    public NumberOfRecentCalls() {
        pings = new ArrayList<>();
    }

    public int ping(int t) {
        for (int i = 0; i < pings.size(); i++) {
            if (pings.get(i) < t - 3000) {
                pings.remove(i--);
            } else break;
        }
        pings.add(t);
        return pings.size();
    }
}
