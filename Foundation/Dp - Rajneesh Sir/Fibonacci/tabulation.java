//Time - O(n)
//Space - O(n)

import java.util.Scanner;

public class tabulation {

    public static int fibo(int N, int[] dp) {

        for (int n = 0; n <= N; n++) {

            if (n <= 1) {
                dp[n] = n;
                continue;
            }

            int ans = dp[n - 1] + dp[n - 2];

            dp[n] = ans;
        }

        return dp[N];
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int res = fibo(n, new int[n + 1]);

        System.out.println(res);

        scn.close();
    }
}