package Extra;

import java.util.Scanner;

public class spiral2 {

    public static void printSpiral(int[][] arr) {

        int minc = 0;
        int minr = 0;
        int maxc = arr[0].length - 1;
        int maxr = arr.length - 1;
        int ne = (maxr + 1) * (maxc + 1);
        int count = 0;

        while (count < ne) {

            // Top
            for (int c = minc; c <= maxc && count < ne; c++) {

                System.out.println(arr[minr][c]);
                count++;
            }
            minr++;

            // Right
            for (int r = minr; r <= maxr && count < ne; r++) {

                System.out.println(arr[r][maxc]);
                count++;
            }
            maxc--;

            // Bottom
            for (int c = maxc; c >= minc && count < ne; c--) {

                System.out.println(arr[maxr][c]);
                count++;
            }
            maxr--;

            // Left
            for (int r = maxr; r >= minr && count < ne; r--) {

                System.out.println(arr[r][minc]);
                count++;
            }
            minc++;
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {

                arr[i][j] = scn.nextInt();
            }
        }

        printSpiral(arr);
        scn.close();
    }
}