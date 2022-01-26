// Time - O(n)
// Space - O(n)

import java.util.Scanner;

public class fib_tab {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] dp = new int[n + 1];

        int ans = fib(n, dp);
        System.out.println(ans);

        scn.close();
    }

    public static int fib(int N, int[] dp) {

        for (int n = 0; n < dp.length; n++) {

            if (n <= 1) {
                dp[n] = n;
                continue;
            }

            dp[n] = dp[n - 1] + dp[n - 2];
        }

        return dp[N];
    }

}