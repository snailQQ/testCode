package leetcode.leetcode.to160;

/**
 * Created by Paul on 11/2/15.
 * question link
 * <p/>
 * answer link
 */
public class _142LinkedListCycleII {
  public static class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
      this.val = val;
      this.next = null;
    }
  }
  public ListNode detectCycle(ListNode head) {
    if(head == null) {
      return null;
    }
    ListNode fast = head;
    ListNode slow = head;
    while(fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if(slow == fast) {
        ListNode slow2 = head;
        while(slow != slow2) {
          slow = slow.next;
          slow2 = slow2.next;
        }
        return slow2;
      }
    }
    return null;
  }
}
