package test;


import main.InsertionSortList;
import main.ListNode;
import org.junit.jupiter.api.Test;

class InsertionSortListTest {

    @Test
    void test() {
        InsertionSortList insertionSortList = new InsertionSortList();
        ListNode listNode = new ListNode(4);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(1);
        ListNode listNode4 = new ListNode(3);
        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        System.out.println(insertionSortList.insertionSortList(listNode));
    }
}