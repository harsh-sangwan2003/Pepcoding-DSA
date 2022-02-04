//Time - O(n^2)
//Space - O(n)

import java.util.Scanner;

public class variable_jumps_stairs_tab {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int[] dp = new int[n + 1];
        int res = countPaths(0, n, arr, dp);
        System.out.println(res);

        scn.close();
    }

    public static int countPaths(int SRC, int dest, int[] arr, int[] dp) {

        for (int src = dp.length - 1; src >= 0; src--) {

            if (src == dest) {
                dp[src] = 1;
                continue;
            }

            int count = 0;

            for (int jump = 1; jump <= arr[src] && jump + src <= dest; jump++) {

                count += dp[src + jump];
            }

            dp[src] = count;
        }

        return dp[SRC];
    }

}