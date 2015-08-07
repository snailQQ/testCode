package lin.E4_20150806;

/**
 * Created by Paul on 8/5/15.
 * http://www.lintcode.com/en/problem/reverse-linked-list/
 */
//Reverse Linked List
//
//        41% Accepted
//        Reverse a linked list.
//
//        Have you met this question in a real interview? Yes
//        Example
//        For linked list 1->2->3, the reversed linked list is 3->2->1
//
//        Challenge
//        Reverse it in-place and in one-pass
public class E35ReverseLinkedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    /**
     * @param head: The head of linked list.
     * @return: The new head of reversed linked list.
     */
    public static ListNode reverse(ListNode head) {
        // write your code here
        if(head == null) {
            return head;
        }
        ListNode returnNode = new ListNode(0);
        while(head != null) {
            ListNode temp = new ListNode(0);
            temp.val= head.val;
            temp.next = returnNode.next;
            returnNode.next = temp;
            head = head.next;
        }
        return returnNode.next;
    }

    public static void main(String [] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;

        ListNode f = reverse(l1);

    }
}
