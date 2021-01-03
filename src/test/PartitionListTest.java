package test;

import main.ListNode;
import main.everyday.PartitionList;
import org.junit.jupiter.api.Test;

class PartitionListTest {

    @Test
    void test() {
        PartitionList partitionList = new PartitionList();
        ListNode node = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(2);
        node.next = node2;
        //node2.next = node3;
        /*node3.next = node4;
        node4.next = node5;
        node5.next = node6;*/
        System.out.println(partitionList.partition(node, 2));
    }
}