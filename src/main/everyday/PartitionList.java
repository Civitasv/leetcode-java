package main.everyday;

import main.ListNode;

/**
 * 分隔链表
 * 给你一个链表和一个特定值 x ，请你对链表进行分隔，使得所有小于 x 的节点都出现在大于或等于 x 的节点之前。
 * <p>
 * 你应当保留两个分区中每个节点的初始相对位置。
 */
public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        if (head == null)
            return null;
        ListNode fake = new ListNode();
        fake.next = head;
        ListNode lo, temp;
        if (head.val < x) {
            lo = head;
            temp = head;
        } else {
            lo = fake;
            temp = fake;
        }
        while (lo.next != null) {
            int val = lo.next.val;
            if (val < x) {
                if (lo == temp) {
                    temp = lo.next;
                    lo = lo.next;
                } else {
                    ListNode node = lo.next;
                    lo.next = node.next;
                    node.next = temp.next;
                    temp.next = node;
                    temp = node;
                }
            } else
                lo = lo.next;
        }
        return fake.next;
    }
}
