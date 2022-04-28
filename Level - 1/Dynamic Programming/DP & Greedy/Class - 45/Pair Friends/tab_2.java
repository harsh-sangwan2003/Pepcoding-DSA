//Time - O(n)
//Space - O(n)

import java.util.Scanner;

public class tab_2 {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] dp = new int[n + 1];

        int res = pairFriends(n, dp);
        System.out.println(res);

        scn.close();
    }

    public static int pairFriends(int n, int[] dp) {

        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i < dp.length; i++) {

            dp[i] = dp[i - 1] + (i - 1) * dp[i - 2];
        }

        return dp[n];
    }

}