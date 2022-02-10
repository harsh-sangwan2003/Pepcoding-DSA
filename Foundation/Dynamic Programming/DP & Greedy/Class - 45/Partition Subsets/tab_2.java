//Time - O(n*k)
//Space - O(n*k)

import java.util.Scanner;

public class tab_2 {

    public static long partitionKSubset(int n, int k, long[][] dp) {
        // write your code here
        for (int t = 0; t < dp[0].length; t++) {

            for (int p = 0; p < dp.length; p++) {

                if (p == 0 || t == 0 || p < t)
                    dp[p][t] = 0;

                else if (p == t)
                    dp[p][t] = 1;

                else
                    dp[p][t] = dp[p - 1][t] * t + dp[p - 1][t - 1];
            }
        }

        return dp[n][k];
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int k = scn.nextInt();

        long[][] dp = new long[n + 1][k + 1];
        long res = partitionKSubset(n, k, dp);

        System.out.println(res);
        scn.close();
    }
}