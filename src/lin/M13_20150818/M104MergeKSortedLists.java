package lin.M13_20150818;

import java.util.List;

/**
 * Created by Paul on 8/17/15.
 * http://www.lintcode.com/en/problem/merge-k-sorted-lists/
 */
//Merge k Sorted Lists
//
//        25% Accepted
//        Merge k sorted linked lists and return it as one sorted list.
//
//        Analyze and describe its complexity.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given lists:
//
//        [
//        2->4->null,
//        null,
//        -1->null
//        ],
//        return -1->2->4->null.
public class M104MergeKSortedLists {
    /**
     * Definition for ListNode.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int val) {
     *         this.val = val;
     *         this.next = null;
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
     * @param lists: a list of ListNode
     * @return: The head of one sorted list.
     */
    public ListNode mergeKLists(List<ListNode> lists) {
        // write your code here
        if(lists == null || lists.size() == 0) {
            return null;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = lists.get(0);
        ListNode cur = dummy;
        for(int i = 1; i < lists.size(); i++) {
            ListNode node = lists.get(i);
            while(node != null) {
                if(cur.next != null && cur.next.val < node.val) {
                    cur = cur.next;
                } else {
                    ListNode tmp = node.next;
                    node.next = cur.next;
                    cur.next = node;
                    node = tmp;
                }
            }
            cur = dummy;
        }

        return dummy.next;
    }
}
