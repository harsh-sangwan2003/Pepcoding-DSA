//Time - O(2^n)
//Space - O(n)

import java.util.Scanner;

public class max_sum_nonadj_1 {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();

        maxSumSubset(0, 0, arr, false);

        System.out.println(max_sum);
        scn.close();
    }

    static int max_sum = Integer.MIN_VALUE;

    public static void maxSumSubset(int idx, int sos, int[] arr, boolean flag) {

        if (idx == arr.length) {

            max_sum = Math.max(max_sum, sos);
            return;
        }

        if (!flag) {

            maxSumSubset(idx + 1, sos + arr[idx], arr, true);
            maxSumSubset(idx + 1, sos, arr, false);
        }

        else {

            maxSumSubset(idx + 1, sos, arr, false);
        }
    }
}