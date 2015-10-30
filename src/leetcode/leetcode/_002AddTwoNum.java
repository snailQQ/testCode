package leetcode.leetcode;

/**
 * Created by Paul on 10/27/15.
 */
//题目
//https://leetcode.com/problems/add-two-numbers/
// 答案
//http://www.cnblogs.com/springfor/p/3864493.html

public class _002AddTwoNum {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) {
            return l1;
        }

        if(l1 == null) {
            return l2;
        }

        if(l2 == null) {
            return l1;
        }

        int carry = 0;
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        while(l1 != null && l2 != null) {
            ListNode newNode = new ListNode((l1.val + l2.val + carry) % 10);
            carry = (l1.val + l2.val + carry) / 10;
            p.next = newNode;
            p = p.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null) {
            ListNode newNode = new ListNode((l1.val + carry) % 10);
            carry = (l1.val + carry) / 10;
            p.next = newNode;
            p = p.next;
            l1 = l1.next;
        }

        while(l2 != null) {
            ListNode newNode = new ListNode((l2.val + carry) % 10);
            carry = (l2.val + carry) / 10;
            p.next = newNode;
            p = p.next;
            l2 = l2.next;
        }

        if(carry != 0) {
            ListNode newNode = new ListNode(carry);
            p.next = newNode;
            p = p.next;
        }

        return dummy.next;

    }
}
