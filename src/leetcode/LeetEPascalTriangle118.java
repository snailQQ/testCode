package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paul on 9/24/15.
 */
public class LeetEPascalTriangle118 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rst = new ArrayList<List<Integer>>();
        if(numRows < 1) {
            return rst;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        rst.add(new ArrayList<Integer>(list));

        if(numRows == 1) {
            return rst;
        }
        list.add(1);
        rst.add(new ArrayList<Integer>(list));
        if(numRows == 2) {
            return rst;
        }

        for(int i = 2; i < numRows; i++) {
            List<Integer> oldList = rst.get(i-1);
            ArrayList<Integer> newList = new ArrayList<Integer>();
            newList.add(1);
            for(int j = 1; j < oldList.size(); j++) {
               newList.add(j, oldList.get(j-1) + oldList.get(j));
            }
            newList.add(1);
            rst.add(new ArrayList<Integer>(newList));
        }
        return rst;
    }

    public static void main(String[] args) {
        List<List<Integer>> a = generate(3);
    }
}
