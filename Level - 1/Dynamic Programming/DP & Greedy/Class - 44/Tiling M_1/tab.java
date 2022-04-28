//Time - O(n)
//Space - O(n)

import java.util.Scanner;

public class tab {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int res = countWays(n, m);
        System.out.println(res);

        scn.close();
    }

    public static int countWays(int n, int m) {

        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {

            if (m > i)
                dp[i] = 1;

            else if (m == i)
                dp[i] = 2;

            else
                dp[i] = dp[i - 1] + dp[i - m];
        }

        return dp[n];
    }
}