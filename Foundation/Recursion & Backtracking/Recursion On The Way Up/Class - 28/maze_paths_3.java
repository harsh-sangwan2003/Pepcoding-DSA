import java.util.Scanner;

public class maze_paths_3 {

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
    private static int[][] dir = { { 0, 1 }, { 1, 0 } };
    private static String[] dirName = { "h", "v" };

    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {

        if (sr == dr && sc == dc) {

            System.out.println(psf);
            return;
        }

        for (int i = 0; i < dir.length; i++) {

            int r = sr + dir[i][0];
            int c = sc + dir[i][1];

            if (r <= dr && c <= dc)
                printMazePaths(r, c, dr, dc, psf + dirName[i]);
        }
    }

}