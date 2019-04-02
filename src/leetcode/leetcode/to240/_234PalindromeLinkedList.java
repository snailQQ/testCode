package leetcode.leetcode.to240;

/**
 * Created by Paul on 11/17/15.
 * question link
 * <p/>
 * answer link
 */
public class _234PalindromeLinkedList {
  public static class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
      this.val = val;
      this.next = null;
    }
  }

  public boolean isPalindrome(ListNode head) {
    if(head == null) {
      return false;
    }
    ListNode fast = head;
    ListNode slow = head;
    while(fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    slow = reverse(slow);
    fast = head;
    while(slow != null) {
      if(slow.val != fast.val) {
        return false;
      }
      slow = slow.next;
      fast = fast.next;
    }
    return true;
  }

  public ListNode reverse(ListNode node) {
    if(node == null) {
      return node;
    }
    ListNode dummy = new ListNode(0);
    while(node != null) {
      ListNode temp = node.next;
      node.next = dummy.next;
      dummy.next = node;
      node = temp;
    }
    return dummy.next;
  }
}
