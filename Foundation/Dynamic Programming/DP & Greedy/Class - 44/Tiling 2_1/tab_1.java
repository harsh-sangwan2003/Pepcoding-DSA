//Time- O(n)
//Space- O(n)

import java.util.Scanner;

public class tab_1 {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] dp = new int[n + 1];

        int ways = tiling(n, dp);

        System.out.println(ways);

        scn.close();
    }

    public static int tiling(int N, int[] dp) {

        for (int n = 1; n < dp.length; n++) {

            if (n <= 2) {
                dp[n] = n;
                continue;
            }

            int vways = dp[n - 1];
            int hways = dp[n - 2];

            dp[n] = vways + hways;
        }

        return dp[N];
    }
}