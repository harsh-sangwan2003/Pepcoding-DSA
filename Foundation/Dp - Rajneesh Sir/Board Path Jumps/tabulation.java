// TIme-O(N*len)
//Space - O(ep)

import java.util.Arrays;
import java.util.Scanner;

public class tabulation {

    public static int board_path(int SP, int ep, int[] arr, int[] dp) {

        for (int sp = ep; sp >= 0; sp--) {

            if (sp == ep) {
                dp[sp] = 1;
                continue;
            }

            int count = 0;

            for (int jump : arr) {

                if (sp + jump <= ep)
                    count += dp[sp + jump];

                else
                    break;
            }

            dp[sp] = count;
        }

        return dp[SP];
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