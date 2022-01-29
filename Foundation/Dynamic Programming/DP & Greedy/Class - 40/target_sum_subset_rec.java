// Time - O(2^n)
// Spcae - O(n)

import java.util.*;

public class target_sum_subset_rec {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {

            arr[i] = scn.nextInt();
        }

        int tar = scn.nextInt();

        boolean res = targetSum(0, 0, tar, arr);

        System.out.println(res);
        scn.close();
    }

    public static boolean targetSum(int idx, int sos, int tar, int[] arr) {

        if (sos > tar)
            return false;

        else if (idx == arr.length) {

            if (sos == tar)
                return true;

            return false;
        }

        boolean op1 = targetSum(idx + 1, sos + arr[idx], tar, arr);
        boolean op2 = targetSum(idx + 1, sos, tar, arr);

        return (op1 || op2);
    }
}