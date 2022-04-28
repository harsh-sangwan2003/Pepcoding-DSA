//Time - O(n^2)
//Space - O(n)

import java.util.Scanner;

public class unbounded_knapsack_2 {

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

        int val = maxVal(n, vals, wts, cap);
        System.out.println(val);

        scn.close();
    }

    public static int maxVal(int n, int[] vals, int[] wts, int cap) {

        int[] dp = new int[cap + 1];

        for (int i = 0; i < n; i++) {

            for (int j = wts[i]; j < dp.length; j++) {

                int rbagc = j - wts[i];
                int rbagv = dp[rbagc];
                int tbagv = vals[i] + rbagv;

                dp[j] = Math.max(dp[j], tbagv);
            }
        }

        return dp[cap];
    }
}