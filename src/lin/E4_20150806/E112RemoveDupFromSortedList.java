package lin.E4_20150806;

/**
 * Created by Paul on 8/5/15.
 * http://www.lintcode.com/en/problem/remove-duplicates-from-sorted-list/
 */
//Remove Duplicates from Sorted List
//
//        39% Accepted
//        Given a sorted linked list, delete all duplicates such that each element appear only once.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given 1->1->2, return 1->2.
//        Given 1->1->2->3->3, return 1->2->3.
public class E112RemoveDupFromSortedList {
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
     * @return: ListNode head of linked list
     */
    public static ListNode deleteDuplicates(ListNode head) {
        // write your code here
        if(head == null || head.next == null) {
            return head;
        }

        ListNode dummy = head;
        while(head.next != null) {
            if(head.next == null) {
                return dummy;
            } else {
                if(head.val == head.next.val){
                    head.next = head.next.next;
                }else {
                    head = head.next;
                }
            }
        }
        return dummy;
    }

    public static void main(String [] args) {
        //        Given 1->1->2, return 1->2.
//        Given 1->1->2->3->3, return 1->2->3.
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(2);
        ListNode l4 = new ListNode(3);
        ListNode l5 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        ListNode returnList = deleteDuplicates(l1);

    }
}
