package test;

import main.everyday.MyHashSet;
import org.junit.jupiter.api.Test;

class MyHashSetTest {

    @Test
    void test(){
        MyHashSet hashSet = new MyHashSet();
        hashSet.add(1);
        hashSet.add(2);
        System.out.println(hashSet.contains(1));
    }
}