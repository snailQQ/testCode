package lin.E3_20150805;

/**
 * Created by Paul on 8/5/15.
 * http://www.lintcode.com/en/problem/nth-to-last-node-in-list/#
 */
//Nth to Last Node in List
//
//        42% Accepted
//        Find the nth to last element of a singly linked list.
//
//        The minimum number of nodes in list is n.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given a List  3->2->1->5->null and n = 2, return node  whose value is 1.
//
//        Tags Expand

public class E166NthToLastNodeInList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    /**
     * @param head: The first node of linked list.
     * @param n: An integer.
     * @return: Nth to last node of a singly linked list.
     */
    ListNode nthToLast(ListNode head, int n) {
        // write your code here
        if (head == null) {
            return head;
        }

        ListNode front = head;

        for (int i = 0; i < n; i++) {
            if (front != null) {
                front = front.next;
            } else {
                return null;
            }
        }

        while (front != null) {
            front = front.next;
            head = head.next;
        }

        return head;
    }
}


//    /**
//     * @param head: The first node of linked list.
//     * @param n: An integer.
//     * @return: Nth to last node of a singly linked list.
//     */
//    ListNode nthToLast(ListNode head, int n) {
//        // write your code here
//        if(head == null) {
//            return null;
//        }
//
//        int size = 0;
//        ListNode ln = head;
//        while(ln != null) {
//            size++;
//            ln = ln.next;
//        }
//
//        int position = size - n;
//        if( position < 0) {
//            return null;
//        } else {
//            while(head != null) {
//                if(position == 0) {
//                    return head;
//                } else {
//                    head = head.next;
//                    position--;
//                }
//            }
//        }
//        return null;
//    }