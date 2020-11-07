package test;

import main.ListNode;
import main.SwapNodesInPairs;
import org.junit.jupiter.api.Test;

class SwapNodesInPairsTest {
    @Test
    void test() {
        SwapNodesInPairs pairs = new SwapNodesInPairs();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        ListNode node = pairs.swapPairsRecursion(node1);;
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}