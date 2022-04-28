//Time - O(n*k)
//Space - O(n*k)

import java.util.Scanner;

public class tab_2 {

    public static long partitionKSubset(int n, int k, long[][] dp) {
        // write your code here

        if (n < k || k == 0 || n == 0)
            return 0;

        for (int t = 1; t < dp.length; t++) {

            for (int p = 1; p < dp[0].length; p++) {

                if (p < t)
                    dp[t][p] = 0;

                else if (p == t)
                    dp[t][p] = 1;

                else {

                    dp[t][p] = dp[t - 1][p - 1] + t * dp[t][p - 1];
                }
            }
        }

        return dp[k][n];
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        long[][] dp = new long[k + 1][n + 1];

        long res = partitionKSubset(n, k, dp);
        System.out.println(res);

        scn.close();
    }
}