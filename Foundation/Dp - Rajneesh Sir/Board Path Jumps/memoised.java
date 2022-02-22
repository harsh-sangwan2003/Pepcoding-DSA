//Time - O(len^ep/min(ele)) - recursion
//TIme - O(N*len)
//Space - O(ep)

import java.util.Arrays;
import java.util.Scanner;

public class memoised {

    public static int board_path(int sp, int ep, int[] arr, int[] dp) {

        if (sp == ep)
            return dp[sp] = 1;

        if (dp[sp] != 0)
            return dp[sp];

        int count = 0;

        for (int jump : arr) {

            if (sp + jump <= ep)
                count += board_path(sp + jump, ep, arr, dp);

            else
                break;
        }

        return dp[sp] = count;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int sp = scn.nextInt();
        int ep = scn.nextInt();

        Arrays.sort(arr);

        int countWays = board_path(sp, ep, arr, new int[ep + 1]);
        System.out.println(countWays);

        scn.close();

    }
}