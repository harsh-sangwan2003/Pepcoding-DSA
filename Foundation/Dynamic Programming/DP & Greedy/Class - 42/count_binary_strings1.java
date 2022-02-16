//Time - O(n)
//Space - O(n)

import java.util.Scanner;

public class count_binary_strings1 {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] dp = new int[n + 1][2];

        dp[1][0] = 1;
        dp[1][1] = 1;

        for (int i = 2; i < dp.length; i++) {

            dp[i][1] = dp[i - 1][0] + dp[i - 1][1];
            dp[i][0] = dp[i - 1][1];
        }

        System.out.println(dp[n][0] + dp[n][1]);

        scn.close();
    }

}