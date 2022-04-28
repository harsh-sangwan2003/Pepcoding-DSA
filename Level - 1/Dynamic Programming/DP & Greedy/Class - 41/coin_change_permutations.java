//Time - O(n*amt)
//Time - O(amt)

import java.util.Scanner;

public class coin_change_permutations {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] coins = new int[n];
        for (int i = 0; i < n; i++)
            coins[i] = scn.nextInt();

        int amt = scn.nextInt();

        int res = coinPermutations(coins, amt);
        System.out.println(res);

        scn.close();
    }

    public static int coinPermutations(int[] coins, int amt) {

        int[] dp = new int[amt + 1];
        dp[0] = 1;

        for (int i = 1; i < dp.length; i++) {

            for (int j = 0; j < coins.length; j++) {

                if (i - coins[j] >= 0)
                    dp[i] += dp[i - coins[j]];
            }
        }

        return dp[amt];
    }
}