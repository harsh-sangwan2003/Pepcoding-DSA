//Time - O(2^n)
//Space - O(n)

import java.util.Scanner;

public class memoised {

    public static long partitionKSubset(int n, int k, long[][] dp) {
        // write your code here
        if (n < k || n == 0 || k == 0)
            return 0L;

        else if (n == k)
            return dp[n][k] = 1L;

        if (dp[n][k] != 0)
            return dp[n][k];

        long diff = partitionKSubset(n - 1, k - 1, dp);
        long pair = partitionKSubset(n - 1, k, dp);

        return dp[n][k] = diff + k * pair;
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