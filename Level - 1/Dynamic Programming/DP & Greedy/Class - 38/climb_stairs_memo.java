//Time - O(n)
//Space - O(n)

import java.util.Scanner;

public class climb_stairs_memo {

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

        if (n == 0)
            return dp[n] = 1;

        if (dp[n] != 0)
            return dp[n];

        int count = 0;

        if (n - 1 >= 0)
            count += countPaths(n - 1, dp);

        if (n - 2 >= 0)
            count += countPaths(n - 2, dp);

        if (n - 3 >= 0)
            count += countPaths(n - 3, dp);

        return dp[n] = count;
    }

}