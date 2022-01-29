// Time - O(n*target)
// Space - O(n*target)

import java.util.Scanner;

public class target_sum_subset_tab {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {

            arr[i] = scn.nextInt();
        }

        int tar = scn.nextInt();

        boolean[][] dp = new boolean[n + 1][tar + 1];

        boolean flag = targetSum(arr, dp);

        System.out.println(flag);
        scn.close();
    }

    public static boolean targetSum(int[] arr, boolean[][] dp) {

        int n = dp.length;
        int m = dp[0].length;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                if (j == 0)
                    dp[i][j] = true;

                else if (i == 0)
                    dp[i][j] = false;

                else {

                    boolean exclude = dp[i - 1][j];
                    boolean include = false;

                    if (j - arr[i - 1] >= 0)
                        include = dp[i - 1][j - arr[i - 1]];

                    dp[i][j] = (exclude || include);
                }
            }
        }

        return dp[n - 1][m - 1];
    }
}