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
    public static ListNode reverseBetween(ListNode head, int m , int n) {
    	if(head == null ) {
            return head;
        } 
        int diff = n-m;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        while(m-1 > 0 && head.next != null) {
            head = head.next;
            m--;
        }
        
        ListNode pre = head;
        ListNode cur = head.next;
        while(diff >= 0 && cur.next != null) {
        	ListNode temp = cur.next;
            cur.next = cur.next.next;
            temp.next = cur;
            pre.next = temp;
            diff--;
        }
        
        return dummy.next;
    }
    
    public static void main(String[] args) {
    	ListNode a2 = new ListNode(1);
    	ListNode a1 = new ListNode(3);
		ListNode a = new ListNode(5);
		a2.next = a1;
		a1.next = a;
		ListNode b = reverseBetween(a2, 1, 3);
	}
}
