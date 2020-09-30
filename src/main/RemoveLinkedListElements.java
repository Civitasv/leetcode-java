package main;

/**
 * Remove all elements from a linked list of integers that have value val.
 */
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode fake = new ListNode();
        fake.next = head;
        ListNode res = fake;
        while (fake.next != null) {
            if (fake.next.val == val) {
                fake.next = fake.next.next;
                continue;
            }
            fake = fake.next;
        }
        return res.next;
    }
}
