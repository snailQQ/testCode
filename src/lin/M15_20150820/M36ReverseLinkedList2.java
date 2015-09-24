package lin.M15_20150820;

/**
 * Created by Paul on 8/19/15.
 */
//Reverse Linked List II
//
//        29% Accepted
//        Reverse a linked list from position m to n.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given 1->2->3->4->5->NULL, m = 2 and n = 4, return 1->4->3->2->5->NULL.
//
//        Note
//        Given m, n satisfy the following condition: 1 ≤ m ≤ n ≤ length of list.
//
//        Challenge
//        Reverse it in-place and in one-pass
public class M36ReverseLinkedList2 {
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
     * @oaram m and n
     * @return: The head of the reversed ListNode
     */
//    public ListNode reverseBetween(ListNode head, int m , int n) {
        // write your code
//        if(head == null || m >= n) {
//            return head;
//        }
//
//        ListNode dummy = new ListNode(0);
//        dummy.next = head;
//        head = dummy;
//
//        for(int i= 1; i < m; i++) {
//            if(head == null) {
//                return null;
//            }
//            head = head.next;
//        }
//
//        ListNode preMNode = head;
//        ListNode rNode = new ListNode(0);
//        rNode.next = null;
//        for(int i = m; i <= n; i++) {
//            if(head == null) {
//                return null;
//            }
//            ListNode aNode = head;
//            head = head.next;
//            rNode.next
//        }
//    }
}
