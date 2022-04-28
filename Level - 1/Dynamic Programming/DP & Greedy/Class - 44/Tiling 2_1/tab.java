//Time - O(n)
//Space - O(n)

import java.util.Scanner;

public class tab {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int res = countWays(n);
        System.out.println(res);

        scn.close();
    }

    public static int countWays(int n) {

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {

            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}