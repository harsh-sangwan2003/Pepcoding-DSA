//Time - O(n^2)
//Space - O(n)

import java.util.Scanner;

public class variable_jumps_stairs_tab_2 {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int[] dp = new int[n + 1];
        int res = countPaths(n, arr, dp);
        System.out.println(res);

        scn.close();
    }

    public static int countPaths(int dest, int[] arr, int[] dp) {

        for (int i = dp.length - 1; i >= 0; i--) {

            if (i == dp.length - 1)
                dp[i] = 1;

            else {

                for (int jump = 1; jump <= arr[i] && jump + i <= dest; jump++)
                    dp[i] += dp[i + jump];
            }
        }

        return dp[0];
    }

}