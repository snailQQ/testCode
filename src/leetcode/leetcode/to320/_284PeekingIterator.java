package leetcode.leetcode.to320;

import java.util.Iterator;

/**
 * Created by Paul on 11/17/15.
 * question link
 * <p/>
 * answer link
 * https://leetcode.com/discuss/62829/simple-java-solution-by-caching-next-element
 */
public class _284PeekingIterator {
    Iterator<Integer> itor;
    Integer cache;
    public _284PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        this.itor = iterator;
        cache = this.itor.next();
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return cache;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
//    @Override
    public Integer next() {
        Integer rst = cache;
        if(itor.hasNext()) {
            cache = itor.next();
        } else {
            cache = null;
        }
        return rst;
    }

//    @Override
    public boolean hasNext() {
        return cache != null;
    }
}
