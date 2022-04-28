//Time - O(n*m)
//Space - O(n*m)

import java.util.Scanner;

public class goldmine_memo {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                arr[i][j] = scn.nextInt();
            }
        }

        int res = 0;
        int[][] dp = new int[n][m];

        for (int r = 0; r < n; r++) {

            int temp = getMaxGold(r, 0, arr, dp);

            res = Math.max(res, temp);
        }

        System.out.println(res);

        scn.close();
    }

    public static int getMaxGold(int r, int c, int[][] arr, int[][] dp) {

        if (r < 0 || r >= arr.length || c >= arr[0].length)
            return 0;

        if (dp[r][c] != 0)
            return dp[r][c];

        int res = arr[r][c];

        int op1 = getMaxGold(r - 1, c + 1, arr, dp);
        int op2 = getMaxGold(r, c + 1, arr, dp);
        int op3 = getMaxGold(r + 1, c + 1, arr, dp);

        res += Math.max(op1, Math.max(op2, op3));
        return dp[r][c] = res;
    }

}