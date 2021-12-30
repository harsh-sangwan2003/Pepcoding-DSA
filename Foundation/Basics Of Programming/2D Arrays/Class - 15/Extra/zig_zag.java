package Extra;

import java.util.Scanner;

public class zig_zag {

    public static void pattern(int[][] arr) {

        boolean flag = true;

        for (int r = arr.length - 1; r >= 0; r--) {

            if (flag) {

                for (int c = arr[0].length - 1; c >= 0; c--)
                    System.out.println(arr[r][c]);
            }

            else {

                for (int c = 0; c < arr[0].length; c++)
                    System.out.println(arr[r][c]);
            }

            flag = !flag;
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

        pattern(arr);
        scn.close();
    }
}
