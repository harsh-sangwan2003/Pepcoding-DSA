//Time - O(n)
//Space - O(n)

import java.util.Scanner;

public class memoised {

    public static int board_path(int sp, int ep, int[] dp) {

        if (sp == ep) {

            dp[sp] = 1;
        }

        if (dp[sp] != 0)
            return dp[sp];

        int count = 0;

        for (int dice = 1; dice <= 6 && sp + dice <= ep; dice++) {
            count += board_path(sp + dice, ep, dp);
        }

        return dp[sp] = count;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] dp = new int[n + 1];

        int ans = board_path(0, n, dp);

        System.out.println(ans);

        // for (int val : dp)
        // System.out.print(val + " ");

        scn.close();
    }
}