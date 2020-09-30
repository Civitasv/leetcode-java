package test;

import main.ListNode;
import main.ReverseLinkedList;
import org.junit.jupiter.api.Test;

class ReverseLinkedListTest {
    @Test
    void test() {
        ReverseLinkedList list = new ReverseLinkedList();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode res = list.reverseList(node1);
        System.out.println(res);
    }
}