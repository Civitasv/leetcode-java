package main.offer;

import main.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReversePrintListNode {
    public int[] reversePrint(ListNode head) {
        ListNode temp = head;
        int length = length(head);
        int[] result = new int[length];
        for (int i = length - 1; i >= 0; i--) {
            result[i] = temp.val;
            temp = temp.next;
        }
        return result;
    }

    private int length(ListNode node) {
        int length = 0;
        while (node != null) {
            length++;
            node = node.next;
        }
        return length;
    }
}
