package leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Paul on 10/6/15.
 */
public class LeetMFlatten2DVector251 {
    static class Vector2D {

        public Vector2D(List<List<Integer>> vec2d) {
            row = vec2d.iterator();
            if(row.hasNext())
                col = row.next().iterator();
        }

        public int next() {
            int lastValue = col.next();
            return lastValue;
        }

        public boolean hasNext() {
            if(col == null) {
                return false;
            }
            if(col.hasNext()) {
                return true;
            } else {
                while(row.hasNext()) {
                    col = row.next().iterator();
                    if(col.hasNext())
                        return true;
                }
                return false;
            }
        }

        private Iterator<List<Integer>> row = null;
        private Iterator<Integer> col = null;
    }

    public static void main(String[] args) {
//        [
//        [1,2],
//        [3],
//        [4,5,6]
//        ]
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(1);
        a1.add(2);
        ArrayList<Integer> a2 = new ArrayList<Integer>();
        a2.add(3);
        ArrayList<Integer> a3 = new ArrayList<Integer>();
        a3.add(4);
        a3.add(5);
        a3.add(6);
        List<List<Integer>> aa = new ArrayList<List<Integer>>();
        aa.add(a1);
        aa.add(a2);
        aa.add(a3);
        Vector2D test = new Vector2D(aa);
    }

/**
 * Your Vector2D object will be instantiated and called as such:
 * Vector2D i = new Vector2D(vec2d);
 * while (i.hasNext()) v[f()] = i.next();
 */
}
