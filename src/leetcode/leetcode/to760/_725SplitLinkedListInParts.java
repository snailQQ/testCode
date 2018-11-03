package leetcode.leetcode.to760;

public class _725SplitLinkedListInParts {
  public static class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
      this.val = val;
      this.next = null;
    }
  }

  public static  ListNode[] splitListToParts(ListNode root, int k) {

    ListNode[] returnArray = new ListNode[k];
    int count = 0;
    ListNode p = root;
    while(p != null) {
      count++;
      p = p.next;
    }

    int m = count / k;
    int n = count % k;
    ListNode prev = null;
    for(int i = 0; i < k; i++) {
      returnArray[i] = root;
      for(int j = 0; j < m; j++) {
        prev = root;
        root = root.next;

      }
      if(n != 0 && root != null) {
        prev = root;
        root = root.next;
        n--;
      }
      ListNode nextNode = root;
      if(prev != null) {
         prev.next = null;
      }
      root = nextNode;
    }
    return returnArray;
  }

  public static void main(String[] args) {


    ListNode p4 = new ListNode(4);
    ListNode p3 = new ListNode(3);
    p3.next = p4;
    ListNode p2 = new ListNode(2);
    p2.next = p3;
    ListNode p1 = new ListNode(1);
    p1.next = p2;

    splitListToParts(p1, 5);
  }
}
