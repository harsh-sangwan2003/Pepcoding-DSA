// Time - O(n)
// Space - O(n)

import java.util.Scanner;

public class memoised {

    public static int climbStairs(int n) {

        return helper(n, new int[n + 1]);
    }

    public static int helper(int n, int[] dp) {

        if (n == 0 || n == 1)
            return dp[n] = 1;

        if (n < 0)
            return 0;

        if (dp[n] != 0)
            return dp[n];

        int n_1 = helper(n - 1, dp);
        int n_2 = helper(n - 2, dp);

        return dp[n] = n_1 + n_2;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int ans = climbStairs(n);

        System.out.println(ans);

        scn.close();
    }
}