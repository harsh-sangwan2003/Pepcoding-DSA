//Time - O(n)
//Space - O(n)

import java.util.Scanner;

public class climb_stairs_tab_2 {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] dp = new int[n + 1];
        int res = countPaths(n, dp);
        System.out.println(res);

        scn.close();
    }

    public static int countPaths(int n, int[] dp) {

        dp[0] = 1;

        for (int i = 1; i < dp.length; i++) {

            if (i == 1)
                dp[i] = dp[i - 1];

            else if (i == 2)
                dp[i] = dp[i - 1] + dp[i - 2];

            else
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        return dp[n];
    }

}