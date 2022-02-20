//Time - O(n)
//Space - O(n)

import java.util.Scanner;

public class tabulation {

    public static int board_path(int SP, int ep, int[] dp) {

        for (int sp = ep; sp >= SP; sp--) {

            if (sp == ep) {

                dp[sp] = 1;
                continue;
            }

            int count = 0;

            for (int dice = 1; dice <= 6 && sp + dice <= ep; dice++) {
                count += dp[sp + dice];
            }

            dp[sp] = count;
        }

        return dp[0];
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