// Time - O(n)
// Space - O(n)

import java.util.Scanner;

public class tabulation {

    public static int climbStairs(int n) {

        return helper(n, new int[n + 1]);
    }

    public static int helper(int N, int[] dp) {

        for (int n = 0; n <= N; n++) {

            if (n == 0 || n == 1) {
                dp[n] = 1;
                continue;
            }

            int n_1 = dp[n - 1];
            int n_2 = dp[n - 2];

            dp[n] = n_1 + n_2;
        }

        return dp[N];
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int ans = climbStairs(n);

        System.out.println(ans);

        scn.close();
    }
}