package leetcode.leetcode.to160;

/**
 * Created by Paul on 11/2/15.
 * question link
 * <p/>
 * answer link
 */
public class _141LinkedListCycle {

  public static class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
      this.val = val;
      this.next = null;
    }
  }

  public boolean hasCycle(ListNode head) {
    if(head == null) {
      return false;
    }
    ListNode fast = head;
    ListNode slow = head;

    while(fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if(slow == fast) {
        return true;
      }
    }
    return false;
  }
}
