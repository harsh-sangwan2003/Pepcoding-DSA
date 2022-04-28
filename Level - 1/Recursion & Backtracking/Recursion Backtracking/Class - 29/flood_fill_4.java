//Time - O(n^2)
//Space - O(n)

import java.util.*;

public class flood_fill_4 {

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

    static int[][] dir = { { -1, 0 }, { 0, -1 }, { 1, 0 }, { 0, 1 } };
    static String[] dirName = { "t", "l", "d", "r" };

    // asf -> answer so far
    public static void floodfill(int[][] maze, int sr, int sc, String asf) {

        if (sr == maze.length - 1 && sc == maze[0].length - 1) {
            System.out.println(asf);
            return;
        }

        maze[sr][sc] = 1;

        for (int i = 0; i < dir.length; i++) {

            int r = sr + dir[i][0];
            int c = sc + dir[i][1];

            if (r >= 0 && c >= 0 && r < maze.length && c < maze[0].length && maze[r][c] != 1)
                floodfill(maze, r, c, asf + dirName[i]);
        }

        maze[sr][sc] = 0;
    }
}
