package test;

import main.ListNode;
import main.RemoveNthNodeFromEndOfList;
import org.junit.jupiter.api.Test;

public class RemoveNthNodeFromEndOfListTest {

    @Test
    public void test(){
        ListNode head = new ListNode(1);
        ListNode first = new ListNode(2);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(5);
        head.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList();
        removeNthNodeFromEndOfList.removeNthFromEnd(head,2);
    }
}
