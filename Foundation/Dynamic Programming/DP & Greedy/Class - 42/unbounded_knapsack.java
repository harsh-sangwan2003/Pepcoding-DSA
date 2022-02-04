//Time - O(n*cap)
//Space - O(cap)

import java.util.Scanner;

public class unbounded_knapsack {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] vals = new int[n];
        for (int i = 0; i < n; i++)
            vals[i] = scn.nextInt();

        int[] wts = new int[n];
        for (int i = 0; i < n; i++)
            wts[i] = scn.nextInt();

        int cap = scn.nextInt();

        int res = knapsack(n, vals, wts, cap);
        System.out.println(res);

        scn.close();
    }

    public static int knapsack(int n, int[] vals, int[] wts, int cap) {

        int[] dp = new int[cap + 1];

        for (int bagc = 1; bagc <= cap; bagc++) {

            int max = 0;
            for (int i = 0; i < n; i++) {

                int bagv = vals[i];
                int rbagc = bagc - wts[i];

                if (rbagc >= 0) {

                    bagv += dp[rbagc];
                    max = Math.max(max, bagv);
                }
            }

            dp[bagc] = max;
        }

        return dp[cap];
    }
}