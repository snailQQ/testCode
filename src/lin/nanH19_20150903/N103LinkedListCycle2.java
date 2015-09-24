package lin.nanH19_20150903;

/**
 * Created by Paul on 9/8/15.
 */
//Linked List Cycle II
//
//        36% Accepted
//        Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given -21->10->4->5, tail connects to node index 1，返回10
//
//        Challenge
//        Follow up:
//        Can you solve it without using extra space?
//
//        Tags Expand
//
//        Related Problems Expand

public class N103LinkedListCycle2 {
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
     * @return: The node where the cycle begins.
     *           if there is no cycle, return null
     */
    public ListNode detectCycle(ListNode head) {
        // write your code here
        if(head == null || head.next == null) {
            return null;
        }

        ListNode fast = head.next;
        ListNode slow = head;

        while(fast != slow) {
            if(fast == null || fast.next == null) {
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
        }

        while(head != slow.next) {
            head = head.next;
            slow = slow.next;
        }

        return head;

    }
}
