//Time - O(n)
//Space - O(n)

import java.util.Scanner;

public class memo {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[] dp = new int[n + 1];

        int res = countWays(n, m, dp);
        System.out.println(res);

        scn.close();
    }

    public static int countWays(int n, int m, int[] dp) {

        if (m > n)
            return dp[n] = 1;

        else if (m == n)
            return dp[n] = 2;

        if (dp[n] != 0)
            return dp[n];

        return dp[n] = countWays(n - 1, m, dp) + countWays(n - m, m, dp);
    }
}