//Time - O(n)
//Spacee - O(n)

import java.util.Scanner;

public class paint_house {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] arr = new int[n][3];
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < 3; j++) {

                arr[i][j] = scn.nextInt();
            }
        }

        int res = paintHouse(arr);
        System.out.println(res);

        scn.close();
    }

    public static int paintHouse(int[][] arr) {

        int n = arr.length;
        int m = 3;

        int[][] dp = new int[n][m];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                if (i == 0)
                    dp[i][j] = arr[i][j];

                else {

                    if (j == 0)
                        dp[i][j] = arr[i][j] + Math.min(dp[i - 1][1], dp[i - 1][2]);

                    else if (j == 1)
                        dp[i][j] = arr[i][j] + Math.min(dp[i - 1][0], dp[i - 1][2]);

                    else
                        dp[i][j] = arr[i][j] + Math.min(dp[i - 1][0], dp[i - 1][1]);
                }
            }
        }

        int min = Integer.MAX_VALUE;

        for (int c = 0; c < 3; c++)
            min = Math.min(dp[n - 1][c], min);

        return min;
    }
}