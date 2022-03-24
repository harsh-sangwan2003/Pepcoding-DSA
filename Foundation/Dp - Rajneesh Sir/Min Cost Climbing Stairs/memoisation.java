class Solution {
    public int minCostClimbingStairs(int[] cost) {

        int ans = mcs(cost.length, cost, new int[cost.length + 1]);

        return ans;
    }

    public int mcs(int n, int[] cost, int[] dp) {

        if (n <= 1)
            return dp[n] = cost[n];

        if (dp[n] != 0)
            return dp[n];

        int tmp = n == cost.length ? 0 : cost[n];

        return dp[n] = Math.min(mcs(n - 1, cost, dp), mcs(n - 2, cost, dp)) + tmp;
    }
}