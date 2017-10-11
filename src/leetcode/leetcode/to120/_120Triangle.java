package leetcode.leetcode.to120;

import java.util.ArrayList;

/**
 * Created by Paul on 11/2/15.
 * question link https://leetcode.com/problems/triangle/description/
 *
 * Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.

 For example, given the following triangle
 [
 [2],
 [3,4],
 [6,5,7],
 [4,1,8,3]
 ]
 The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).

 Note:
 Bonus point if you are able to do this using only O(n) extra space, where n is the total number of rows in the triangle.
 * <p/>
 * answer link
 */
public class _120Triangle {
  public static int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
    if(triangle == null || triangle.size() == 0) {
      return 0;
    }

    int[] dp = new int[triangle.size()];

    //计算最下层
    for(int i = 0; i < triangle.size(); i++) {
      dp[i] = triangle.get(triangle.size()-1).get(i);
    }

    for(int i = triangle.size()-2; i >= 0; i-- ) {
      for(int j = 0; j < triangle.get(i).size(); j++) {
        dp[j] = Math.min(dp[j], dp[j+1]) + triangle.get(i).get(j);
      }
    }
    return dp[0];
  }

  public static void main(String[] args) {
    ArrayList<Integer> a = new ArrayList<Integer>();
    a.add(2);
    ArrayList<Integer> b = new ArrayList<Integer>();
    b.add(3);
    b.add(4);
    ArrayList<Integer> c = new ArrayList<Integer>();
    c.add(6);
    c.add(5);
    c.add(7);
//    ArrayList<Integer> d = new ArrayList<Integer>();
//    d.add(4);
//    d.add(1);
//    d.add(8);
//    d.add(3);
    ArrayList<ArrayList<Integer>> triangle = new ArrayList<ArrayList<Integer>>();
    triangle.add(a);
    triangle.add(b);
    triangle.add(c);
//    triangle.add(d);

    System.out.println(minimumTotal(triangle));
  }
}
