import java.util.Scanner;

public class exitPoint {

    public static void exit(int[][] arr) {

        int dir = 0;
        int i = 0;
        int j = 0;

        while (true) {

            dir = (dir + arr[i][j]) % 4;

            if (dir == 0) {

                j += 1;
            }

            else if (dir == 1) {

                i += 1;
            }

            else if (dir == 2) {

                j -= 1;
            }

            else {

                i -= 1;
            }

            if (i < 0) {

                i += 1;
                break;
            }

            if (j < 0) {

                j += 1;
                break;
            }

            if (i == arr.length) {

                i -= 1;
                break;
            }

            if (j >= arr[0].length) {

                j -= 1;
                break;
            }
        }

        System.out.println(i);
        System.out.println(j);
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

        exit(arr);
        scn.close();
    }
}