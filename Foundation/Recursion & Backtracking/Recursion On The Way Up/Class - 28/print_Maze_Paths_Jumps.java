import java.util.Scanner;

public class print_Maze_Paths_Jumps {

    public static void printPaths(int sr, int sc, int dr, int dc, String psf) {

        if (sr == dr && sc == dc) {

            System.out.println(psf);
            return;
        }

        for (int count = 1; count + sc <= dc; count++) {

            printPaths(sr, sc + count, dr, dc, psf + "h" + count);
        }

        for (int count = 1; count + sr <= dr; count++) {

            printPaths(sr + count, sc, dr, dc, psf + "v" + count);
        }

        for (int count = 1; count + sc <= dc && count + sr <= dr; count++) {

            printPaths(sr + count, sc + count, dr, dc, psf + "d" + count);
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        printPaths(0, 0, n - 1, m - 1, "");
        scn.close();
    }
}