package leetcode.leetcode.to320;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Paul on 11/17/15.
 * question link
 * <p/>https://leetcode.com/problems/zigzag-iterator/
 * answer link
 * https://leetcode.com/discuss/63037/simple-java-solution-for-k-vector
 * http://blog.csdn.net/xudli/article/details/48749219
 */
public class _281_ZigzagIterator {
    LinkedList<Iterator> list;
    public _281_ZigzagIterator(List<Integer> v1, List<Integer> v2) {
        list = new LinkedList<Iterator>();
        if(!v1.isEmpty()) {
            list.add(v1.iterator());
        }
        if(!v2.isEmpty()) {
            list.add(v2.iterator());
        }
    }

    public int next() {
        Iterator itor = list.remove();
        int result = (int) itor.next();
        if(itor.hasNext()) {
            list.add(itor);
        }
        return result;
    }

    public boolean hasNext() {
        return !list.isEmpty();
    }
}
/**
 * Your ZigzagIterator object will be instantiated and called as such:
 * ZigzagIterator i = new ZigzagIterator(v1, v2);
 * while (i.hasNext()) v[f()] = i.next();
 */