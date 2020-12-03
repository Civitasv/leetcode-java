package main;

/**
 * Given a linked list, swap every two adjacent nodes and return its head.
 * <p>
 * You may not modify the values in the list's nodes, only nodes itself may be changed.
 */
public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = head;
        ListNode res = head.next;
        while (temp != null && temp.next != null) {
            // remove this
            ListNode node = temp;
            temp = temp.next;
            node.next = temp.next;
            temp.next = node;
            temp = node.next;
            if (temp != null && temp.next != null) node.next = temp.next;
        }
        return res;
    }

    public ListNode swapPairsRecursion(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode res = head.next;
        head.next = res.next;
        res.next = head;
        head.next = swapPairsRecursion(head.next);
        return res;
    }

}
