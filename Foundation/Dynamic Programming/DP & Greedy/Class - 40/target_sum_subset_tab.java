// Time - O(n*target)
// Spcae - O(n*target)

import java.util.Scanner;

public class target_sum_subset_tab {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int tar = scn.nextInt();

        boolean[][] dp = new boolean[n + 1][tar + 1];

        boolean res = targetSum(arr, dp);

        System.out.println(res);
        scn.close();
    }

    public static boolean targetSum(int[] arr, boolean[][] dp) {

        int n = dp.length;
        int m = dp[0].length;

        for (int r = 0; r < n; r++) {

            for (int c = 0; c < m; c++) {

                if (c == 0)
                    dp[r][c] = true;

                else if (r == 0)
                    dp[r][c] = false;

                else {

                    boolean exculde = dp[r - 1][c];
                    boolean include = false;

                    if (c - arr[r - 1] >= 0) {

                        include = dp[r - 1][c - arr[r - 1]];
                    }

                    dp[r][c] = (include || exculde);
                }
            }
        }

        return dp[n - 1][m - 1];
    }
}