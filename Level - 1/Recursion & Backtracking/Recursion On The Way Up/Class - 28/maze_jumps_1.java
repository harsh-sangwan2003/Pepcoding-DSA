//Time - O(3^(n+m))
//Space - O(n+m)

import java.util.Scanner;

public class maze_jumps_1 {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        printMazePaths(0, 0, n - 1, m - 1, "");
        scn.close();
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {

        if (sr == dr && sc == dc) {

            System.out.println(psf);
            return;
        }

        for (int ms = 1; ms + sc <= dc; ms++) {

            printMazePaths(sr, sc + ms, dr, dc, psf + "h" + ms);
        }

        for (int ms = 1; ms + sr <= dr; ms++) {

            printMazePaths(sr + ms, sc, dr, dc, psf + "v" + ms);
        }

        for (int ms = 1; ms + sc <= dc && ms + sr <= dr; ms++) {

            printMazePaths(sr + ms, sc + ms, dr, dc, psf + "d" + ms);
        }
    }

}