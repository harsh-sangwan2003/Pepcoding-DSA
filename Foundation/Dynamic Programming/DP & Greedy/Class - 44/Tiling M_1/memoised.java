//Time - O(n)
//Space - O(1)

import java.util.Scanner;

public class memoised {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[] dp = new int[n + 1];

        int ways = tiling(n, m, dp);
        System.out.println(ways);

        scn.close();
    }

    public static int tiling(int n, int m, int[] dp) {

        if (m > n)
            return dp[n] = 1;

        else if (m == n)
            return dp[n] = 2;

        if (dp[n] != 0)
            return dp[n];

        return dp[n] = tiling(n - 1, m, dp) + tiling(n - m, m, dp);

    }
}