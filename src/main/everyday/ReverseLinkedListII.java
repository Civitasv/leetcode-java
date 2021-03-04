package main.everyday;

import main.ListNode;

/**
 * 翻转链表
 */
public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp = head;
        ListNode newHead = null, midStart = null, midEnd = null, start = null;
        int index = 0;
        while (true) {
            if (index == left - 2) {
                start = temp;
                temp = temp.next;
            } else if (index >= left - 1 && index < right) {
                if (index == left - 1)
                    midEnd = temp;
                if (index == right - 1)
                    midStart = temp;
                ListNode next = temp.next;
                temp.next = newHead;
                newHead = temp;
                temp = next;
            } else if (index == right) {
                if (start != null)
                    start.next = midStart;
                else head = newHead;
                if (midEnd != null)
                    midEnd.next = temp;
                break;
            } else temp = temp.next;
            index++;
        }
        return head;
    }
}
