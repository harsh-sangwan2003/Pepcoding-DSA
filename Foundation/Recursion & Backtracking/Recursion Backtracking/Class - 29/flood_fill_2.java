import java.util.Scanner;

public class flood_fill_2 {

    public static void floodfill(int[][] arr, int r, int c, String psf) {

        if (r >= arr.length || c >= arr[0].length || r < 0 || c < 0 || arr[r][c] == 1)
            return;

        if (r == arr.length - 1 && c == arr[0].length - 1) {

            System.out.println(psf);
            return;
        }

        arr[r][c] = 1;
        floodfill(arr, r - 1, c, psf + "t");
        floodfill(arr, r, c - 1, psf + "l");
        floodfill(arr, r + 1, c, psf + "d");
        floodfill(arr, r, c + 1, psf + "r");
        arr[r][c] = 0;
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

        floodfill(arr, 0, 0, "");
        scn.close();
    }
}