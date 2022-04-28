import java.util.Scanner;

public class exitPoint {

    public static void printExit(int[][] arr) {

        int dir = 0;
        int r = 0;
        int c = 0;

        while (true) {

            dir = (dir + arr[r][c]) % 4;

            if (dir == 0) {

                c += 1;
            }

            else if (dir == 1) {

                r += 1;
            }

            else if (dir == 2) {
                c -= 1;
            }

            else {
                r -= 1;
            }

            if (r < 0) {

                r += 1;
                break;
            }

            if (c < 0) {
                c += 1;
                break;
            }

            if (r == arr.length) {

                r -= 1;
                break;
            }

            if (c == arr[0].length) {

                c -= 1;
                break;
            }
        }

        System.out.println(r);
        System.out.println(c);
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

        printExit(arr);
        scn.close();
    }
}
