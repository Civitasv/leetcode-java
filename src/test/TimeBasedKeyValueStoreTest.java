package test;

import main.everyday.TimeBasedKeyValueStore;
import org.junit.jupiter.api.Test;

class TimeBasedKeyValueStoreTest {

    @Test
    void test() {
        TimeBasedKeyValueStore timeBasedKeyValueStore = new TimeBasedKeyValueStore();
        timeBasedKeyValueStore.set("love", "high", 10);
        timeBasedKeyValueStore.set("love", "low", 20);
        System.out.println(timeBasedKeyValueStore.get("love", 5)); // ""
        System.out.println(timeBasedKeyValueStore.get("love", 10)); // "high"
        System.out.println(timeBasedKeyValueStore.get("love", 15)); // "high"
        System.out.println(timeBasedKeyValueStore.get("love", 20)); // "low"
        System.out.println(timeBasedKeyValueStore.get("love", 25)); // "low"
    }
}