//Time - O(n^k*2)
//Space - O(1)

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

        int res = minCost(arr);
        System.out.println(res);

        scn.close();
    }

    public static int minCost(int[][] arr) {

        int n = arr.length;
        int m = arr[0].length;

        int fmin = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;

        for (int j = 0; j < m; j++) {

            if (arr[0][j] < fmin) {

                smin = fmin;
                fmin = arr[0][j];
            }

            else if (arr[0][j] < smin)
                smin = arr[0][j];
        }

        for (int i = 1; i < n; i++) {

            int nfmin = Integer.MAX_VALUE;
            int nsmin = Integer.MAX_VALUE;

            for (int j = 0; j < m; j++) {

                if (fmin == arr[i - 1][j])
                    arr[i][j] += smin;

                else
                    arr[i][j] += fmin;

                if (arr[i][j] < nfmin) {

                    nsmin = nfmin;
                    nfmin = arr[i][j];
                }

                else if (arr[i][j] < nsmin)
                    nsmin = arr[i][j];
            }

            fmin = nfmin;
            smin = nsmin;
        }

        return fmin;
    }
}