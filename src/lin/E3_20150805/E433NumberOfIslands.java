package lin.E3_20150805;

/**
 * Created by Paul on 8/5/15.
 * http://www.lintcode.com/en/problem/number-of-islands/
 * http://segmentfault.com/a/1190000003753307 dfs
 * http://www.zhuangjingyang.com/leetcode-number-of-islands/ dfs
 * http://blog.csdn.net/guorudi/article/details/44997949 bfs
 */
//Number of Islands
//
//        20% Accepted
//        Given a boolean 2D matrix, find the number of islands.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given graph:
//
//        [
//        [1, 1, 0, 0, 0],
//        [0, 1, 0, 0, 1],
//        [0, 0, 0, 1, 1],
//        [0, 0, 0, 0, 0],
//        [0, 0, 0, 0, 1]
//        ]
//        return 3.
//
//        Note
//        0 is represented as the sea, 1 is represented as the island. If two 1 is adjacent, we consider them in the same island. We only consider up/down/left/right adjacent.
//
//        Related Problems Expand

public class E433NumberOfIslands {
    /**
     * @param grid a boolean 2D matrix
     * @return an integer
     */
    public static int numIslands(boolean[][] grid) {
        // Write your code here
        if(grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int islandCount = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]) {
                    dfs(grid, i, j);
                    islandCount++;
                }
            }
        }
        return islandCount;
    }

    private static void dfs(boolean[][] grid, int i, int j) {
        grid[i][j] = false;
        if(i>0 && grid[i-1][j]) {
            dfs(grid, i-1, j);
        }
        if(j>0 && grid[i][j-1]) {
            dfs(grid, i, j-1);
        }
        if(i<grid.length-1 && grid[i+1][j]) {
            dfs(grid, i+1, j);
        }
        if(j<grid[0].length-1 && grid[i][j+1]) {
            dfs(grid, i, j+1);
        }
    }

    public static void main(String[] args) {
        boolean[][] a = {{true,true,false,false,false},{false,true,false,false,true},{false,false,false,true,true},{false,false,false,false,false},{false,false,false,false,true}};
        int b = numIslands(a);
    }
}
