package lin.M15_20150820;

/**
 * Created by Paul on 8/19/15.
 * http://www.lintcode.com/en/problem/remove-duplicates-from-sorted-list-ii/
 */
//Remove Duplicates from Sorted List II
//
//        26% Accepted
//        Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given 1->2->3->3->4->4->5, return 1->2->5.
//        Given 1->1->1->2->3, return 2->3.
public class M113RemoveDuplicatesFromSortedList2 {
    /**
     * Definition for ListNode
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    /**
     * @param ListNode head is the head of the linked list
     * @return: ListNode head of the linked list
     */
    public static ListNode deleteDuplicates(ListNode head) {
        // write your code here
        if (head == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;

        while (head.next != null && head.next.next != null) {
            if(head.next.val == head.next.next.val) {
                int val = head.next.val;
                while(head.next != null && head.next.val == val) {
                    head.next = head.next.next;
                }
            } else {
                head = head.next;
            }
        }

        return dummy.next;
    }
}
