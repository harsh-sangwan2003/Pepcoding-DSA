import java.util.Scanner;

public class maze_path_jumps {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        printMazePaths(0, 0, n - 1, m - 1, "");
        scn.close();
    }

    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {

        if (sr == dr && sc == dc) {

            System.out.println(psf);
            return;
        }

        for (int ms = 1; sc + ms <= dc; ms++) {

            printMazePaths(sr, sc + ms, dr, dc, psf + "h" + ms);
        }

        for (int ms = 1; sr + ms <= dr; ms++) {

            printMazePaths(sr + ms, sc, dr, dc, psf + "v" + ms);
        }

        for (int ms = 1; sr + ms <= dr && sc + ms <= dc; ms++) {

            printMazePaths(sr + ms, sc + ms, dr, dc, psf + "d" + ms);
        }
    }

}