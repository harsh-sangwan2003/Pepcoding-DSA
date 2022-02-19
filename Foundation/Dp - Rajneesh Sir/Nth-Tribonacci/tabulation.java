//Time - O(n)
//Space - O(n)

import java.util.Scanner;

public class tabulation {

    public static int tribonacci(int n) {

        return tb(n, new int[n + 1]);
    }

    public static int tb(int N, int[] dp) {

        for (int n = 0; n <= N; n++) {

            if (n <= 2) {
                dp[n] = n == 0 ? 0 : 1;
                continue;
            }

            dp[n] = dp[n - 1] + dp[n - 2] + dp[n - 3];
        }

        return dp[N];
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int res = tribonacci(n);

        System.out.println(res);

        scn.close();
    }
}