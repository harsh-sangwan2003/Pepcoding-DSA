//Time - O(n*k)
//Space - O(n*k)

import java.util.Scanner;

public class memo {

    public static long partitionKSubset(int n, int k, long[][] dp) {
        // write your code here

        if (n < k)
            return dp[n][k] = 0;

        else if (k == 1 || n == k)
            return dp[n][k] = 1;

        long x = partitionKSubset(n - 1, k - 1, dp);
        long y = partitionKSubset(n - 1, k, dp);

        return dp[n][k] = (long) (x + y * k);
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