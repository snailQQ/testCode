package leetcode.leetcode.to240;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Paul on 11/17/15.
 * question link
 * <p/>
 * answer link
 */
public class _210CourseScheduleII {
    public static  int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] rst = new int[numCourses];
        // if(prerequisites == null || prerequisites.length == 0 || prerequisites[0].length == 0) {
        //     return null;
        // }

        int[] inDegree = new int[numCourses];
        for(int i = 0; i < prerequisites.length; i++) {
            inDegree[prerequisites[i][0]]++;
        }

        Queue<Integer> queue = new LinkedList<Integer>();
        int index = 0;
        for(int i = 0; i < numCourses; i++) {
            if(inDegree[i] == 0) {
                queue.offer(i);
                rst[index++] = i;
            }
        }

        int canFinish = 0;
        while(!queue.isEmpty()) {
            int node = queue.poll();
            for(int i = 0; i < prerequisites.length; i++) {
                if(prerequisites[i][1] == node) {
                    inDegree[prerequisites[i][0]]--;
                    if(inDegree[prerequisites[i][0]] == 0) {
                        queue.offer(prerequisites[i][0]);
                        rst[index++] = prerequisites[i][0];
                    }
                }
            }
        }
        if(index != numCourses) {
            return new int[0];
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] a = findOrder(3,new int[][]{{1,0},{2,1}});
    }
}
