package leetcode;

/**
 * Created by Paul on 9/30/15.
 * http://blog.csdn.net/u013027996/article/details/46832437
 */
public class LeetEPalindromeLinkedList234 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public boolean isPalindrome(ListNode head) {
        if(head == null) {
            return false;
        }

        if(head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = slow.next;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode p = slow.next;
        ListNode q;
        ListNode end = null;
        while(p != null) {
            q = p.next;
            p.next = end;
            end = p;
            p = q;
        }

        while(head != null && end != null) {
            if(head.val != end.val) {
                return false;
            }
            head = head.next;
            end = end.next;
        }
        return true;

    }
}
