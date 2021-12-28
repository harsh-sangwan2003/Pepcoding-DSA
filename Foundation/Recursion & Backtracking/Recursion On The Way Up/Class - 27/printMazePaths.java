import java.util.Scanner;

public class printMazePaths {

    public static void printPaths(int sr, int sc, int dr, int dc, String ans) {

        if (sr == dr && sc == dc) {

            System.out.println(ans);
            return;
        }

        if (sc + 1 <= dc) {

            printPaths(sr, sc + 1, dr, dc, ans + "h");
        }

        if (sr + 1 <= dr) {

            printPaths(sr + 1, sc, dr, dc, ans + "v");
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
