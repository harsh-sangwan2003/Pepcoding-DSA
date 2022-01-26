// Time - O(n*m)
// Space - O(n*m)

import java.util.Scanner;

public class maze_traversal_tab {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int[][] dp = new int[n][m];
        int ans = minCost(0, 0, arr, dp);
        System.out.println(ans);

        scn.close();
    }

    public static int minCost(int SR, int SC, int[][] arr, int[][] dp) {

        for (int sr = arr.length - 1; sr >= 0; sr--) {

            for (int sc = arr[0].length - 1; sc >= 0; sc--) {

                if (sr == arr.length - 1 && sc == arr[0].length - 1) {
                    dp[sr][sc] = arr[sr][sc];
                    continue;
                }

                int cost = arr[sr][sc];

                if (sr + 1 < arr.length && sc + 1 < arr[0].length)
                    cost += Math.min(dp[sr + 1][sc], dp[sr][sc + 1]);

                else if (sr + 1 < arr.length)
                    cost += dp[sr + 1][sc];

                else
                    cost += dp[sr][sc + 1];

                dp[sr][sc] = cost;
            }
        }

        return dp[SR][SC];
    }

}