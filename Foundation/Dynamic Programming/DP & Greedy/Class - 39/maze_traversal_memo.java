// Time - O(n*m)
// Space - O(n*m)

import java.util.Scanner;

public class maze_traversal_memo {

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

    public static int minCost(int sr, int sc, int[][] arr, int[][] dp) {

        if (sr == arr.length - 1 && sc == arr[0].length - 1)
            return dp[sr][sc] = arr[sr][sc];

        if (dp[sr][sc] != 0)
            return dp[sr][sc];

        int cost = arr[sr][sc];

        if (sr + 1 < arr.length && sc + 1 < arr[0].length)
            cost += Math.min(minCost(sr + 1, sc, arr, dp), minCost(sr, sc + 1, arr, dp));

        else if (sr + 1 < arr.length)
            cost += minCost(sr + 1, sc, arr, dp);

        else
            cost += minCost(sr, sc + 1, arr, dp);

        return dp[sr][sc] = cost;
    }

}