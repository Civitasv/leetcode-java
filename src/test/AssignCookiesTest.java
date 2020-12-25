package test;

import main.AssignCookies;
import org.junit.jupiter.api.Test;

class AssignCookiesTest {

    @Test
    void test() {
        AssignCookies cookies = new AssignCookies();
        System.out.println(cookies.findContentChildren(new int[]{1, 2}, new int[]{1, 2, 3}));
    }
}