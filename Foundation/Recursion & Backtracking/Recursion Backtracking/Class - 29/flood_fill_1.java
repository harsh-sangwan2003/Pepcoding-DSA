//Time - O(n^2)
//Space - O(n^2)

import java.util.Scanner;

public class flood_fill_1 {

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

        if (sr < 0 || sc < 0 || sr >= maze.length || sc >= maze[0].length || maze[sr][sc] == 1 || visit[sr][sc])
            return;

        else if (sr == maze.length - 1 && sc == maze[0].length - 1) {
            System.out.println(asf);
            return;
        }

        visit[sr][sc] = true;

        helper(maze, sr - 1, sc, asf + "t", visit);
        helper(maze, sr, sc - 1, asf + "l", visit);
        helper(maze, sr + 1, sc, asf + "d", visit);
        helper(maze, sr, sc + 1, asf + "r", visit);

        visit[sr][sc] = false;
    }
}
