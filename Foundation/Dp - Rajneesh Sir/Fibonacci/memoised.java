//Time - O(n)
//Space - O(n)

import java.util.Scanner;

public class memoised {

    public static int fibo(int n, int[] dp) {

        if (n <= 1)
            return dp[n] = n;

        if (dp[n] != 0)
            return dp[n];

        int ans = fibo(n - 1, dp) + fibo(n - 2, dp);

        return dp[n] = ans;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int res = fibo(n, new int[n + 1]);

        System.out.println(res);

        scn.close();
    }
}