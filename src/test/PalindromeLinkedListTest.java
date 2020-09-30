package test;

import main.ListNode;
import main.PalindromeLinkedList;
import org.junit.jupiter.api.Test;

class PalindromeLinkedListTest {

    @Test
    void test() {
        PalindromeLinkedList linkedList = new PalindromeLinkedList();

        ListNode node = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);

        node.next = node2;
        node2.next = node3;
        node3.next = node4;

        System.out.println(linkedList.isPalindrome(node));
    }
}