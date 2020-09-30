package main;


public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = new ListNode(0);
        node.next = head;
        ListNode first = head;
        int length = 0;
        // find length
        while (first != null) {
            first = first.next;
            length++;
        }
        first = node;
        // remove node
        for (int i = 0; i < length - n; i++) {
            first = first.next;
        }
        first.next = first.next.next;
        return node.next;
    }
}
