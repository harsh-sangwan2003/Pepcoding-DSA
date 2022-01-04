import java.util.Scanner;

public class maze_path_jumps_2 {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        printMazePaths(0, 0, n - 1, m - 1, "");
        scn.close();
    }

    public static int[][] dir = { { 0, 1 }, { 1, 0 }, { 1, 1 } };
    public static char[] dirName = { 'h', 'v', 'd' };

    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {

        if (sr == dr && sc == dc) {

            System.out.println(psf);
            return;
        }

        for (int i = 0; i < dir.length; i++) {

            for (int ms = 1; ms <= Math.max(dr, dc); ms++) {

                int r = sr + (dir[i][0] * ms);
                int c = sc + (dir[i][1] * ms);

                if (r <= dr && c <= dc) {

                    printMazePaths(r, c, dr, dc, psf + dirName[i] + ms);
                }
            }
        }
    }

}