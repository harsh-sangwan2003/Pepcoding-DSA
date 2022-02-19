//TIme - O(n)
//Space - O(n)

import java.util.Scanner;

public class memoised {

    public static int climbStairs(int n) {

        return climbStairs(n, new int[n + 1]);
    }

    public static int climbStairs(int n, int[] dp) {

        if (n <= 1)
            return dp[n] = 1;

        if (dp[n] != 0)
            return dp[n];

        int ans = climbStairs(n - 1, dp) + climbStairs(n - 2, dp);

        return dp[n] = ans;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int ans = climbStairs(n);

        System.out.println(ans);

        scn.close();
    }
}