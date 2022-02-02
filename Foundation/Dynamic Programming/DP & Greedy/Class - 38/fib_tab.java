//Time - O(n)
//Space - O(n)

import java.util.Scanner;

public class fib_tab {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] dp = new int[n + 1];

        int res = fibonacci(n, dp);
        System.out.println(res);

        scn.close();
    }

    public static int fibonacci(int N, int[] dp) {

        for (int n = 0; n < dp.length; n++) {

            if (n <= 1) {
                dp[n] = n;
                continue;
            }

            int n_1 = dp[n - 1];
            int n_2 = dp[n - 2];

            dp[n] = n_1 + n_2;
        }

        return dp[N];
    }

}