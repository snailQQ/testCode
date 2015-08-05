package lin.E2_20150804;

/**
 * Created by Paul on 8/3/15.
 * http://www.lintcode.com/en/problem/insertion-sort-list/
 */
//Insertion Sort List
//
//        31% Accepted
//        Sort a linked list using insertion sort.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given 1->3->2->0->null, return 0->1->2->3->null.
public class E173InsertSortList {
    /**/
//     Definition for ListNode.
     public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
     }
//    Insertion Sort就是把一个一个元素往已排好序的list中插入的过程。
//
//    初始时，sorted list是空，把一个元素插入sorted list中。然后，在每一次插入过程中，都是找到最合适位置进行插入。
//
//    因为是链表的插入操作，需要维护pre，cur和next3个指针。
//
//    pre始终指向sorted list的fakehead，cur指向当前需要被插入的元素，next指向下一个需要被插入的元素。
//
//
//
//    当sortedlist为空以及pre.next所指向的元素比cur指向的元素值要大时，需要把cur元素插入到pre.next所指向元素之前。
//    否则，pre指针后移。最后返回fakehead的next即可。
        /**
         * @param head: The first node of linked list.
         * @return: The head of linked list.
         */
        public static ListNode insertionSortList(ListNode head) {
            // write your code here
            ListNode dummy = new ListNode(0);

            while (head != null) {
                ListNode node = dummy;
                while (node.next != null && node.next.val < head.val) {
                    node = node.next;
                }
                ListNode temp = head.next;
                head.next = node.next;
                node.next = head;
                head = temp;
            }

            return dummy.next;

        }

    public static void main(String [] args) {
//        1->3->2->0->null
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l0 = new ListNode(0);
        l1.next = l3;
        l3.next = l2;
        l2.next = l0;

        insertionSortList(l1);
    }
}
