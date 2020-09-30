package test;


import main.ListNode;
import main.RemoveDuplicatesFromSortedList;
import org.junit.jupiter.api.Test;

class RemoveDuplicatesFromSortedListTest {
    @Test
    void test() {
        // 1->1->2;
        ListNode node = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(3);
        node.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        RemoveDuplicatesFromSortedList endOfList = new RemoveDuplicatesFromSortedList();
        endOfList.deleteDuplicates(node);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}