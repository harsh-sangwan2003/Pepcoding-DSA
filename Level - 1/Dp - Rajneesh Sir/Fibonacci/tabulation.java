// Time - O(n)
// Space - O(n)

import java.util.Scanner;

public class tabulation {

    public static int fib(int N, int[] dp) {

        for (int n = 0; n <= N; n++) {

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

    public static void display(int[] arr) {

        for (int val : arr)
            System.out.print(val + " ");
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] dp = new int[n + 1];

        int ans = fib(n, dp);

        System.out.println(ans);
        display(dp);
        
        scn.close();
    }
}