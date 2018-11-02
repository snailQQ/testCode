package leetcode.leetcode.to840;

import java.util.HashSet;
import java.util.Set;

public class _817LinkedListComponents {
  public static class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
      this.val = val;
      this.next = null;
    }
  }

  public static int numComponents(ListNode head, int[] G) {
    if(head == null || G == null || G.length == 0) {
      return 0;
    }
    Set<Integer> gSet = new HashSet<>();
    for(int i : G) {
      gSet.add(i);
    }
    int count = 0;
    while(head != null) {
      if(gSet.contains(head.val)
          && (head.next == null || !gSet.contains(head.next.val))) {
        count++;
      }
      head = head.next;
    }
    return count;
  }

  public static void main(String[] args) {
    int[] a = {0,1,3};


    ListNode p4 = new ListNode(3);
    ListNode p3 = new ListNode(2);
    p3.next = p4;
    ListNode p2 = new ListNode(1);
    p2.next = p3;
    ListNode p1 = new ListNode(0);
    p1.next = p2;

    System.out.println(numComponents(p1, a));
  }
}
