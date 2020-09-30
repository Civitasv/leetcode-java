package test;

import main.ListNode;
import main.RemoveLinkedListElements;
import org.junit.jupiter.api.Test;

class RemoveLinkedListElementsTest {

    @Test
    void test() {
        RemoveLinkedListElements elements = new RemoveLinkedListElements();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(6);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(6);
        ListNode node = elements.removeElements(node1, 1);
        System.out.println(node);
    }
}