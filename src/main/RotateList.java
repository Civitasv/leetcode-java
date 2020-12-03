package main;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null)
            return null;
        if (head.next == null)
            return head;

        // construct an empty node element, and it's next is head
        ListNode fake = new ListNode();
        fake.next = head;

        int size = 1;
        ListNode curr = head;
        while (curr.next != null) { // move curr to end
            curr = curr.next;
            size++;
        }
        k %= size; // remove repeat operation
        rotateLeft(fake, head, curr, size - k); // move the left element to right
        return fake.next;
    }

    /**
     * move the element head to end
     *
     * @param fake    fake->next = head
     * @param head    current head
     * @param currEnd current end
     * @param size    move times
     */
    public void rotateLeft(ListNode fake, ListNode head, ListNode currEnd, int size) {
        if (size == 0)
            return;
        fake.next = head.next;
        currEnd.next = head;
        head.next = null;
        rotateLeft(fake, fake.next, head, --size);
    }
}
