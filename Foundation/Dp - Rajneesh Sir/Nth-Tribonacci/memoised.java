//Time - O(n)
//Space - O(n)

import java.util.Scanner;

public class memoised {

    public static int tribonacci(int n) {

        return tb(n, new int[n + 1]);
    }

    public static int tb(int n, int[] dp) {

        if (n == 0)
            return dp[n] = n;

        if (n <= 2)
            return dp[n] = 1;

        if (dp[n] != 0)
            return dp[n];

        return dp[n] = tb(n - 1, dp) + tb(n - 2, dp) + tb(n - 3, dp);
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int res = tribonacci(n);

        System.out.println(res);

        scn.close();
    }
}