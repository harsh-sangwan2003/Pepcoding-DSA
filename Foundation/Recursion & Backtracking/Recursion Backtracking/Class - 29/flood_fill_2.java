//Time - O(n^2)
//Space - O(n^2)

import java.util.*;

public class flood_fill_2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        floodfill(arr, 0, 0, "");
        scn.close();
    }

    // asf -> answer so far
    public static void floodfill(int[][] maze, int sr, int sc, String asf) {

        boolean[][] visit = new boolean[maze.length][maze[0].length];

        helper(maze, 0, 0, "", visit);
    }

    public static void helper(int[][] maze, int sr, int sc, String asf, boolean[][] visit) {

        if (sr == maze.length - 1 && sc == maze[0].length - 1) {
            System.out.println(asf);
            return;
        }

        visit[sr][sc] = true;

        if (sr - 1 >= 0 && maze[sr - 1][sc] != 1 && !visit[sr - 1][sc])
            helper(maze, sr - 1, sc, asf + "t", visit);

        if (sc - 1 >= 0 && maze[sr][sc - 1] != 1 && !visit[sr][sc - 1])
            helper(maze, sr, sc - 1, asf + "l", visit);

        if (sr + 1 < maze.length && maze[sr + 1][sc] != 1 && !visit[sr + 1][sc])
            helper(maze, sr + 1, sc, asf + "d", visit);

        if (sc + 1 < maze[0].length && maze[sr][sc + 1] != 1 && !visit[sr][sc + 1])
            helper(maze, sr, sc + 1, asf + "r", visit);

        visit[sr][sc] = false;
    }
}
