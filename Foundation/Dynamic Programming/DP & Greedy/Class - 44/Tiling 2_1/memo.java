//Time - O(n)
//Space - O(n)

import java.util.Scanner;

public class memo {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] dp = new int[n + 1];

        int res = countWays(n, dp);
        System.out.println(res);

        scn.close();
    }

    public static int countWays(int n, int[] dp) {

        if (n <= 2)
            return dp[n] = n;

        if (dp[n] != 0)
            return dp[n];

        int n_1 = countWays(n - 1, dp);
        int n_2 = countWays(n - 2, dp);

        return dp[n] = n_1 + n_2;
    }
}