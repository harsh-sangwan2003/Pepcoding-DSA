// Time - O(n)
// Space - O(n)

import java.util.Scanner;

public class memoisation {

    public static int fib(int n, int[] dp) {

        if (n <= 1)
            return dp[n] = n;

        if (dp[n] != 0)
            return dp[n];

        int n_1 = fib(n - 1, dp);
        int n_2 = fib(n - 2, dp);

        return dp[n] = n_1 + n_2;
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