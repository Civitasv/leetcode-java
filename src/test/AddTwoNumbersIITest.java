package test;


import main.AddTwoNumbersII;
import main.ListNode;
import org.junit.jupiter.api.Test;

class AddTwoNumbersIITest {

    @Test
    void test() {
        ListNode node = new ListNode(7);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(3);

        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(4);

        node.next = node2;
        node2.next = node3;
        node3.next = node4;

        node5.next = node6;
        node6.next = node7;

        AddTwoNumbersII addTwoNumbersII = new AddTwoNumbersII();
        ListNode res = addTwoNumbersII.addTwoNumbers(node, node5);
        System.out.println(res);
    }
}