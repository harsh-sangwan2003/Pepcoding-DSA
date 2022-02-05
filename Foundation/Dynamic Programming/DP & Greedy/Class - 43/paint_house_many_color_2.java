//Time - O(n*k)
//Space - O(n*k)

import java.util.Scanner;

public class paint_house_many_color_2 {

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

        int fmin = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;

        for (int col = 0; col < k; col++) {
            dp[0][col] = arr[0][col];

            if (arr[0][col] < fmin) {

                smin = fmin;
                fmin = arr[0][col];
            }

            else if (arr[0][col] < smin)
                smin = arr[0][col];
        }

        for (int i = 1; i < n; i++) {

            int nfmin = Integer.MAX_VALUE;
            int nsmin = Integer.MAX_VALUE;

            for (int j = 0; j < k; j++) {

                if (dp[i - 1][j] == fmin)
                    dp[i][j] = arr[i][j] + smin;

                else
                    dp[i][j] = arr[i][j] + fmin;

                if (dp[i][j] < nfmin) {

                    nsmin = nfmin;
                    nfmin = dp[i][j];
                }

                else if (dp[i][j] < nsmin)
                    nsmin = dp[i][j];
            }

            fmin = nfmin;
            smin = nsmin;
        }

        return fmin;
    }
}