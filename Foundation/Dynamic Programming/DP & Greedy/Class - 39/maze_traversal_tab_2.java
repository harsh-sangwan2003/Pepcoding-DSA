//Time - O(n*m)
//Space - O(1)

import java.util.Scanner;

public class maze_traversal_tab_2 {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] maze = new int[n][m];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                maze[i][j] = scn.nextInt();
            }
        }

        int res = minCostMaze(maze);
        System.out.println(res);

        scn.close();
    }

    public static int minCostMaze(int[][] maze) {

        int n = maze.length;
        int m = maze[0].length;

        for (int r = n - 1; r >= 0; r--) {

            for (int c = m - 1; c >= 0; c--) {

                if (r == n - 1 && c == m - 1)
                    continue;

                else if (r == n - 1)
                    maze[r][c] += maze[r][c + 1];

                else if (c == m - 1)
                    maze[r][c] += maze[r + 1][c];

                else
                    maze[r][c] += Math.min(maze[r + 1][c], maze[r][c + 1]);
            }
        }

        return maze[0][0];
    }

}