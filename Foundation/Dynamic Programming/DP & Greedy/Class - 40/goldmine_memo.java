// Time - O(n^2)
// Space - O(n^2)

import java.util.Scanner;

public class goldmine_memo {

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

        int ans = 0;
        int[][] dp = new int[n][m];

        for (int i = 0; i < n; i++) {

            int temp = goldmine(i, 0, arr, dp);

            ans = Math.max(ans, temp);
        }

        System.out.println(ans);

        scn.close();
    }

    public static int goldmine(int r, int c, int[][] arr, int[][] dp) {

        if (r < 0 || r >= arr.length || c >= arr[0].length)
            return 0;

        if (dp[r][c] != 0)
            return dp[r][c];

        int res = arr[r][c];

        int op1 = goldmine(r - 1, c + 1, arr, dp);
        int op2 = goldmine(r, c + 1, arr, dp);
        int op3 = goldmine(r + 1, c + 1, arr, dp);

        res += Math.max(op1, Math.max(op2, op3));
        dp[r][c] = res;

        return res;
    }

}