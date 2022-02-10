//Time - O(2^n)
//Space - O(n)

import java.util.Scanner;

public class tab_1 {

    public static long partitionKSubset(int N, int K, long[][] dp) {
        // write your code here
        for (int k = 0; k < dp[0].length; k++) {

            for (int n = 0; n < dp.length; n++) {

                if (n < k || n == 0 || k == 0)
                    continue;

                else if (n == k) {
                    dp[n][k] = 1L;
                    continue;
                }

                long diff = dp[n - 1][k - 1];
                long pair = dp[n - 1][k];

                dp[n][k] = diff + k * pair;
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