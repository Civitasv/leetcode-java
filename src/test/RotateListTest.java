package test;

import main.ListNode;
import main.RotateList;
import org.junit.jupiter.api.Test;

class RotateListTest {

    @Test
    public void test() {
        RotateList rotateList = new RotateList();
        ListNode node = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        System.out.println(rotateList.rotateRight(node, 2));
    }
}