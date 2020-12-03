package main;

public class AddTwoNumbersII {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode fake = new ListNode();
        ListNode temp = fake;
        int length1 = length(l1);
        int length2 = length(l2);
        int minus = length1 - length2;
        if (minus > 0) {
            while (minus > 0) {
                temp = temp.next = new ListNode(l1.val);
                l1 = l1.next;
                minus--;
            }
        } else if (minus < 0) {
            while (minus < 0) {
                temp = temp.next = new ListNode(l2.val);
                l2 = l2.next;
                minus++;
            }
        }
        while (l1 != null && l2 != null) {
            temp = temp.next = new ListNode(l1.val + l2.val);
            l1 = l1.next;
            l2 = l2.next;
        }
        boolean isAdd = true; // 标记是否有需要进位的
        while (isAdd) {
            boolean add = false;
            temp = fake.next;
            if (temp.val >= 10) {
                temp.val -= 10;
                ListNode node = new ListNode(1);
                node.next = fake.next;
                fake.next = node;
            }
            while (temp.next != null) {
                if (temp.next.val >= 10) {
                    temp.next.val -= 10;
                    temp.val += 1;
                    add = true;
                }
                temp = temp.next;
            }
            isAdd = add;
        }

        return fake.next;
    }

    public int length(ListNode node) {
        int len = 0;
        while (node != null) {
            len++;
            node = node.next;
        }
        return len;
    }
}
