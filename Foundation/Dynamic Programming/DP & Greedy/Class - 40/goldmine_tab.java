// Time - O(n^2)
// Space - O(n^2)

import java.util.Scanner;

public class goldmine_tab {

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

        int ans = goldmine(arr, dp);
        System.out.println(ans);

        scn.close();
    }

    public static int goldmine(int[][] arr, int[][] dp) {

        int n = dp.length;
        int m = dp[0].length;

        for (int c = m - 1; c >= 0; c--) {

            for (int r = n - 1; r >= 0; r--) {

                if (c == m - 1)
                    dp[r][c] = arr[r][c];

                else if (r == 0)
                    dp[r][c] = arr[r][c] + Math.max(dp[r][c + 1], dp[r + 1][c + 1]);

                else if (r == n - 1)
                    dp[r][c] = arr[r][c] + Math.max(dp[r][c + 1], dp[r - 1][c + 1]);

                else
                    dp[r][c] = arr[r][c] + Math.max(dp[r - 1][c + 1], Math.max(dp[r][c + 1], dp[r + 1][c + 1]));
            }
        }

        int temp = 0;

        for (int row = 0; row < n; row++)
            temp = Math.max(temp, dp[row][0]);

        return temp;
    }

}