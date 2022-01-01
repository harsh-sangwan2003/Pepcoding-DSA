import java.util.Scanner;

public class flood_fill_1 {

    public static void floodfill(int[][] arr, int r, int c, String psf, boolean[][] visit) {

        if (r >= arr.length || c >= arr[0].length || r < 0 || c < 0 || visit[r][c] || arr[r][c] == 1)
            return;

        if (r == arr.length - 1 && c == arr[0].length - 1) {

            System.out.println(psf);
            return;
        }

        visit[r][c] = true;
        floodfill(arr, r - 1, c, psf + "t", visit);
        floodfill(arr, r, c - 1, psf + "l", visit);
        floodfill(arr, r + 1, c, psf + "d", visit);
        floodfill(arr, r, c + 1, psf + "r", visit);
        visit[r][c] = false;
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

        boolean[][] visit = new boolean[n][m];
        floodfill(arr, 0, 0, "", visit);
        scn.close();
    }
}