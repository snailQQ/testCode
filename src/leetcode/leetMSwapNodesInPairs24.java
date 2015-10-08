package leetcode;

/**
 * Created by Paul on 10/1/15.
 * http://www.cnblogs.com/springfor/p/3862030.html
 */
public class leetMSwapNodesInPairs24 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        if(head.next.next == null) {
            ListNode temp = head;
            head = head.next;
            temp.next = null;
            head.next = temp;
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pos = dummy;
        while(head.next != null && head.next.next != null) {
            ListNode temp = head.next;
            head.next = head.next.next;
            temp.next = head;
            dummy.next = temp;
            head = head.next;
            dummy = dummy.next.next;
        }
        if(head.next != null && head.next.next == null) {
            ListNode temp = head;
            head = head.next;
            temp.next = null;
            head.next = temp;
            dummy.next = head;
        }

        return pos.next;

    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);

        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);

        a.next = b;
        b.next = c;
        c.next = d;
        swapPairs(a);


    }
}
