package main;

/**
 * Sort a linked list using insertion sort.
 */
public class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        if (head == null)
            return null;
        ListNode res = null;
        while (head != null) {
            res = insertSort(res, head.val);
            head = head.next;
        }
        return res;
    }

    public ListNode insertSort(ListNode res, int val) {
        if (res == null) {
            return new ListNode(val);
        }
        if (res.val > val) {
            ListNode node = new ListNode(val);
            node.next = res;
            return node;
        }
        ListNode temp = res;
        while (temp.next != null && temp.next.val < val) {
            temp = temp.next;
        }
        ListNode node = new ListNode(val);
        node.next = temp.next;
        temp.next = node;

        return res;
    }
}
