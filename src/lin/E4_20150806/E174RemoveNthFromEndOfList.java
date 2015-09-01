package lin.E4_20150806;

/**
 * Created by Paul on 8/5/15.
 * http://www.lintcode.com/en/problem/remove-nth-node-from-end-of-list/
 * http://www.cnblogs.com/springfor/p/3862219.html
 */
//Remove Nth Node From End of List
//
//        30% Accepted
//        Given a linked list, remove the nth node from the end of list and return its head.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given linked list: 1->2->3->4->5->null, and n = 2.
//
//        After removing the second node from the end, the linked list becomes 1->2->3->5->null.
//        Note
//        The minimum number of nodes in list is n.
//
//        Challenge
//        O(n) time


public class E174RemoveNthFromEndOfList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    /**
     * @param head: The first node of linked list.
     * @param n: An integer.
     * @return: The head of linked list.
     */
    ListNode removeNthFromEnd(ListNode head, int n) {
        // write your code here
        if (n <= 0) {
            return null;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slower = dummy;
        for (int i = 0; i < n; i++) {
            if (head == null) {
                return null;
            }
            head = head.next;
        }
        while (head != null) {
            head = head.next;
            slower = slower.next;
        }
        slower.next = slower.next.next;
        return dummy.next;
    }
}
