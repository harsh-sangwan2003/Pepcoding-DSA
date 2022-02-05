//Time - O(n*k^2)
//Time - O(n*k)

import java.util.Scanner;

public class paint_house_many_color_1 {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        int[][] arr = new int[n][k];
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < k; j++) {

                arr[i][j] = scn.nextInt();
            }
        }

        int res = paintHouse(arr);
        System.out.println(res);

        scn.close();
    }

    public static int paintHouse(int[][] arr) {

        int n = arr.length;
        int k = arr[0].length;

        int[][] dp = new int[n][k];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < k; j++) {

                if (i == 0) {
                    dp[i][j] = arr[i][j];
                    continue;
                }

                int fmin = Integer.MAX_VALUE;
                int smin = Integer.MAX_VALUE;
                for (int x = 0; x < k; x++) {
                    if (dp[i - 1][x] < fmin) {
                        smin = fmin;
                        fmin = dp[i - 1][x];
                    }

                    else if (dp[i - 1][x] < smin)
                        smin = dp[i - 1][x];
                }

                if (fmin == dp[i - 1][j])
                    dp[i][j] = arr[i][j] + smin;

                else
                    dp[i][j] = arr[i][j] + fmin;
            }
        }

        int ans = Integer.MAX_VALUE;

        for (int c = 0; c < k; c++)
            ans = Math.min(ans, dp[n - 1][c]);

        return ans;
    }
}