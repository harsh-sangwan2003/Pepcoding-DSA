//Time - O(n*m)
//Space - O(n*m)

import java.util.Scanner;

public class goldmine_tab {

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

        int[][] dp = new int[n][m];

        int res = getMaxGold(arr, dp);

        System.out.println(res);

        scn.close();
    }

    public static int getMaxGold(int[][] arr, int[][] dp) {

        int n = arr.length;
        int m = arr[0].length;

        for (int c = m - 1; c >= 0; c--) {

            for (int r = n - 1; r >= 0; r--) {

                if (c == m - 1)
                    dp[r][c] = arr[r][c];

                else if (r == 0)
                    dp[r][c] = arr[r][c] + Math.max(dp[r][c + 1], dp[r + 1][c + 1]);

                else if (r == n - 1)
                    dp[r][c] = arr[r][c] + Math.max(dp[r][c + 1], dp[r - 1][c + 1]);

                else
                    dp[r][c] = arr[r][c] + Math.max(dp[r][c + 1], Math.max(dp[r - 1][c + 1], dp[r + 1][c + 1]));
            }
        }

        int max = 0;

        for (int r = 0; r < n; r++)
            max = Math.max(dp[r][0], max);

        return max;

    }

}