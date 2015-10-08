package leetcode;

/**
 * Created by Paul on 10/6/15.
 */
public class LeetMWallsAndGates286 {
    public static void wallsAndGates(int[][] rooms) {
        if(rooms == null || rooms.length == 0 || rooms[0].length == 0) {
            return;
        }

        boolean[][] visited = new boolean[rooms.length][rooms[0].length];

        for(int i = 0; i < rooms.length; i++) {
            for(int j = 0; j < rooms[0].length; j++) {
                if(rooms[i][j] == 0) {
                    DFS(rooms, visited, i, j, 0);
                }
            }
        }
    }

    private static void DFS(int[][] rooms, boolean[][] visited, int row, int col, int dis) {
        int rows = rooms.length;
        int cols = rooms[0].length;

        if(row < 0 || row >= rows || col < 0 || col >= cols) {
            return;
        }

        if(visited[row][col]) {
            return;
        }

        if(rooms[row][col] == -1) {
            return;
        }

        if (dis > rooms[row][col]) {
            return;
        }

        visited[row][col] = true;
        if( dis < rooms[row][col]) {
            rooms[row][col] = dis;
        }

        DFS(rooms, visited, row+1, col, dis+1);
        DFS(rooms, visited, row-1, col, dis+1);
        DFS(rooms, visited, row, col+1, dis+1);
        DFS(rooms, visited, row, col-1, dis+1);

        visited[row][col] = false;


    }

    public static void main(String[] args) {
        wallsAndGates(new int[][]{{2147483647,-1,0,2147483647},{2147483647,2147483647,2147483647,-1},{2147483647,-1,2147483647,-1},{0,-1,2147483647,2147483647}});
    }
}
