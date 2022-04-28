//Time - O(n*m)
//Space - O(n*m)

import java.util.Scanner;

public class maze_traversal_tab {

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

        int[][] dp = new int[n][m];

        int res = minCostMaze(0, 0, maze, n - 1, m - 1, dp);
        System.out.println(res);

        scn.close();
    }

    public static int minCostMaze(int SR, int SC, int[][] maze, int dr, int dc, int[][] dp) {

        for (int sr = dr; sr >= 0; sr--) {

            for (int sc = dc; sc >= 0; sc--) {

                if (sr == dr && sc == dc) {
                    dp[sr][sc] = maze[sr][sc];
                    continue;
                }

                int cost = maze[sr][sc];

                if (sr + 1 <= dr && sc + 1 <= dc) {

                    cost += Math.min(dp[sr + 1][sc], dp[sr][sc + 1]);
                }

                else if (sr + 1 <= dr) {

                    cost += dp[sr + 1][sc];
                }

                else if (sc + 1 <= dc) {

                    cost += dp[sr][sc + 1];
                }

                dp[sr][sc] = cost;
            }
        }

        return dp[SR][SC];
    }

}