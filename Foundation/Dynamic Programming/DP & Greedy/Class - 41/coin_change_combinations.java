//Time - O(n*amt)
//Space - O(amt)

import java.util.Scanner;

public class coin_change_combinations {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {

            coins[i] = scn.nextInt();
        }

        int amt = scn.nextInt();

        int res = coinCombinations(coins, amt);
        System.out.println(res);

        scn.close();
    }

    public static int coinCombinations(int[] coins, int amt) {

        int[] dp = new int[amt + 1];
        dp[0] = 1;

        for (int i = 0; i < coins.length; i++) {

            for (int j = coins[i]; j <= amt; j++) {

                dp[j] += dp[j - coins[i]];
            }
        }

        return dp[amt];
    }
}