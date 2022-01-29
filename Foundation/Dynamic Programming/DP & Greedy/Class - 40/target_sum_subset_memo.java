// Time - O(n*target)
// Spcae - O(n*target)

import java.util.Scanner;

public class target_sum_subset_memo {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {

            arr[i] = scn.nextInt();
        }

        int tar = scn.nextInt();

        boolean[][] dp = new boolean[n + 1][tar + 1];

        boolean res = targetSum(0, 0, tar, arr, dp);

        System.out.println(res);
        scn.close();
    }

    public static boolean targetSum(int idx, int sos, int tar, int[] arr, boolean[][] dp) {

        if (sos > tar)
            return false;

        else if (idx == arr.length) {

            if (sos == tar)
                return dp[idx][sos] = true;

            return dp[idx][sos] = false;
        }

        if (dp[idx][sos])
            return true;

        boolean op1 = targetSum(idx + 1, sos + arr[idx], tar, arr, dp);
        boolean op2 = targetSum(idx + 1, sos, tar, arr, dp);

        return dp[idx][sos] = (op1 || op2);
    }
}