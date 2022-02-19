//TIme - O(n)
//Space - O(n)

import java.util.Scanner;

public class memoised {

    public static int minCostClimbingStairs(int[] cost) {

        if (cost.length == 2)
            return Math.min(cost[0], cost[1]);

        int n = cost.length;
        int[] dp = new int[n];

        mcs(n - 1, cost, dp);

        return Math.min(dp[n - 1], dp[n - 2]);
    }

    public static int mcs(int n, int[] cost, int[] dp) {

        if (n <= 1)
            return dp[n] = cost[n];

        if (dp[n] != 0)
            return dp[n];

        return dp[n] = cost[n] + Math.min(mcs(n - 1, cost, dp), mcs(n - 2, cost, dp));

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] cost = new int[n];

        for (int i = 0; i < n; i++)
            cost[i] = scn.nextInt();

        int ans = minCostClimbingStairs(cost);

        System.out.println(ans);

        scn.close();
    }
}