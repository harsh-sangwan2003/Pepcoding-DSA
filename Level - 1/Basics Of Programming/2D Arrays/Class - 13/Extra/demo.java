package Extra;

import java.util.Scanner;

public class demo {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        // 1D array
        // int[] arr = new int[n];

        // 2D array
        int[][] arr2 = new int[n][m];

        // Travel each cell
        for (int i = 0; i < arr2.length; i++) {

            for (int j = 0; j < arr2[0].length; j++) {
                arr2[i][j] = scn.nextInt();
            }
        }

        scn.close();
    }
}