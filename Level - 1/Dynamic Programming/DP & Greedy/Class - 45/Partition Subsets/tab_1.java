//Time - O(n*k)
//Space - O(n*k)

import java.util.Scanner;

public class tab_1 {

    public static long partitionKSubset(int N, int K, long[][] dp) {
        // write your code here

        for (int n = 1; n < dp.length; n++) {

            for (int k = 1; k < dp[0].length; k++) {

                if (n < k) {
                    dp[n][k] = 0;
                    continue;
                }

                else if (k == 1 || n == k) {
                    dp[n][k] = 1;
                    continue;
                }

                long x = dp[n - 1][k - 1];
                long y = dp[n - 1][k];

                dp[n][k] = (long) (x + y * k);
            }
        }

        return dp[N][K];
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