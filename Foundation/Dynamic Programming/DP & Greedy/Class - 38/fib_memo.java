import java.util.Scanner;
import java.util.Arrays;

public class fib_memo {

    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        int ans = fib(n, dp);

        System.out.println(ans);
        scn.close();
    }

    public static int fib(int n, int[] dp) {

        if (n <= 1)
            return dp[n] = n;

        if (dp[n] != -1)
            return dp[n];

        int n_1 = fib(n - 1, dp);
        int n_2 = fib(n - 2, dp);

        return dp[n] = n_1 + n_2;
    }

}