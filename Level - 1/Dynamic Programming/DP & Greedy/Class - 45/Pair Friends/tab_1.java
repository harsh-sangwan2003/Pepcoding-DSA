//Time - O(n)
//Space - O(n)

import java.util.Scanner;

public class tab_1 {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] dp = new int[n + 1];

        int res = pairFriends(n, dp);
        System.out.println(res);

        scn.close();
    }

    public static int pairFriends(int N, int[] dp) {

        for (int n = 0; n < dp.length; n++) {

            if (n <= 2) {
                dp[n] = n;
                continue;
            }

            int single = dp[n - 1];
            int pair = dp[n - 2];

            dp[n] = single + (n - 1) * pair;
        }

        return dp[N];
    }

}