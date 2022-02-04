//Time - O(2^max(n,m))
//Space - O(max(n,m))

import java.util.Scanner;

public class maze_traversal_rec {

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

        int res = minCostMaze(0, 0, maze, n - 1, m - 1);
        System.out.println(res);

        scn.close();
    }

    public static int minCostMaze(int sr, int sc, int[][] maze, int dr, int dc) {

        if (sr == dr && sc == dc)
            return maze[sr][sc];

        int cost = maze[sr][sc];

        if (sr + 1 <= dr && sc + 1 <= dc) {

            cost += Math.min(minCostMaze(sr + 1, sc, maze, dr, dc), minCostMaze(sr, sc + 1, maze, dr, dc));
        }

        else if (sr + 1 <= dr) {

            cost += minCostMaze(sr + 1, sc, maze, dr, dc);
        }

        else if (sc + 1 <= dc) {

            cost += minCostMaze(sr, sc + 1, maze, dr, dc);
        }

        return cost;
    }

}