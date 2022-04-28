//Time - O(n)
//Space - O(n)

import java.util.Scanner;

public class fib_memo {

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

        if (n <= 1)
            return dp[n] = n;

        if (dp[n] != 0)
            return dp[n];

        int n_1 = fibonacci(n - 1, dp);
        int n_2 = fibonacci(n - 2, dp);

        return dp[n] = n_1 + n_2;
    }

}