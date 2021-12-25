import java.util.Scanner;
import java.util.ArrayList;

public class get_Maze_Paths {

    public static ArrayList<String> getPaths(int sr, int sc, int dr, int dc) {

        if (sr == dr && sc == dc) {

            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> mres = new ArrayList<>();

        if (sc < dc) {
            ArrayList<String> hpaths = getPaths(sr, sc + 1, dr, dc);
            for (String s : hpaths) {
                mres.add("h" + s);
            }
        }

        if (sr < dr) {
            ArrayList<String> vpaths = getPaths(sr + 1, sc, dr, dc);
            for (String s : vpaths) {
                mres.add("v" + s);
            }
        }

        return mres;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        ArrayList<String> paths = getPaths(0, 0, n - 1, m - 1);
        System.out.println(paths);
        scn.close();
    }
}
