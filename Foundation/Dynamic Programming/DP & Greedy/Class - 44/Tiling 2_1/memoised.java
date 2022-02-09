//Time - O(n)
//Space - O(n)

import java.util.Scanner;

public class memoised {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] dp = new int[n + 1];

        int ways = tiling(n, dp);

        System.out.println(ways);

        scn.close();
    }

    public static int tiling(int n, int[] dp) {

        if (n <= 2)
            return dp[n] = n;

        if (dp[n] != 0)
            return dp[n];

        int vways = tiling(n - 1, dp);
        int hways = tiling(n - 2, dp);

        return dp[n] = vways + hways;
    }
}