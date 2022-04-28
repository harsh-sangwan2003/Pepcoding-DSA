//Time - O(n*target)
//Space - O(n*target)

import java.util.Scanner;

public class target_sum_subset_memo {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int tar = scn.nextInt();

        boolean[][] dp = new boolean[n + 1][tar + 1];

        boolean res = targetSum(0, 0, arr, tar, dp);

        System.out.println(res);
        scn.close();
    }

    public static boolean targetSum(int idx, int sos, int[] arr, int tar, boolean[][] dp) {

        if (sos > tar)
            return false;

        if (idx == arr.length) {

            if (sos == tar)
                return dp[idx][sos] = true;

            else
                return dp[idx][sos] = false;
        }

        if (dp[idx][sos])
            return true;

        boolean op1 = targetSum(idx + 1, sos + arr[idx], arr, tar, dp);
        boolean op2 = targetSum(idx + 1, sos, arr, tar, dp);

        return dp[idx][sos] = (op1 || op2);
    }
}