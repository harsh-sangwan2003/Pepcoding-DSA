//Time - O(2^n)
//Space - O(n)

import java.util.Scanner;

public class target_sum_subset_rec {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int tar = scn.nextInt();

        boolean res = targetSum(0, 0, arr, tar);

        System.out.println(res);
        scn.close();
    }

    public static boolean targetSum(int idx, int sos, int[] arr, int tar) {

        if (sos > tar)
            return false;

        if (idx == arr.length) {

            if (sos == tar)
                return true;

            else
                return false;
        }

        boolean op1 = targetSum(idx + 1, sos + arr[idx], arr, tar);
        boolean op2 = targetSum(idx + 1, sos, arr, tar);

        return (op1 || op2);
    }
}