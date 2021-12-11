package Extra;

import java.util.Scanner;

public class spiral2 {

    public static void spiral(int[][] arr) {

        boolean flag = true;

        for (int r = 0; r < arr.length; r++) {

            if (flag) {

                for (int c = arr[0].length - 1; c >= 0; c--)
                    System.out.print(arr[r][c] + " ");
            }

            else {

                for (int c = 0; c < arr[0].length; c++)
                    System.out.print(arr[r][c] + " ");
            }

            flag = !flag;
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                arr[i][j] = scn.nextInt();
            }
        }

        spiral(arr);
        scn.close();
    }
}
