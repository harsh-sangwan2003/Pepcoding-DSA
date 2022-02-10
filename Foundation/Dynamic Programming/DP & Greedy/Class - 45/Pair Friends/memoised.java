//Time - O(n)
//Space - O(n)

import java.util.Scanner;

public class memoised {

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

        if (n <= 2)
            return dp[n] = n;

        if (dp[n] != 0)
            return dp[n];

        int single = pairFriends(n - 1, dp);
        int pair = pairFriends(n - 2, dp);

        return dp[n] = single + (n - 1) * pair;
    }

}