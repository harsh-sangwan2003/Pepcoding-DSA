//Time - O(n)
//Space - O(n)

import java.util.Scanner;

public class fib_tab_2 {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] dp = new int[n + 1];

        int res = fibonacci(n, dp);
        System.out.println(res);

        scn.close();
    }

    public static int fibonacci(int n, int[] dp) {

        dp[1] = 1;

        for (int i = 2; i < dp.length; i++) {

            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

}