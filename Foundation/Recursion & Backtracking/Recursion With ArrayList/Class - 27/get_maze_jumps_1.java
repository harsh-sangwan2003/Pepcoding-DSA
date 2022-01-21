import java.util.Scanner;
import java.util.ArrayList;

public class get_maze_jumps_1 {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        ArrayList<String> res = getMazePaths(0, 0, n - 1, m - 1);

        System.out.println(res);

        scn.close();
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

        if (sr == dr && sc == dc) {

            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> mres = new ArrayList<>();

        for (int ms = 1; ms + sc <= dc; ms++) {

            ArrayList<String> hpaths = getMazePaths(sr, sc + ms, dr, dc);

            for (String s : hpaths) {

                mres.add("h" + ms + s);
            }
        }

        for (int ms = 1; ms + sr <= dr; ms++) {

            ArrayList<String> vpaths = getMazePaths(sr + ms, sc, dr, dc);

            for (String s : vpaths) {

                mres.add("v" + ms + s);
            }
        }

        for (int ms = 1; ms + sc <= dc && ms + sr <= dr; ms++) {

            ArrayList<String> dpaths = getMazePaths(sr + ms, sc + ms, dr, dc);

            for (String s : dpaths) {

                mres.add("d" + ms + s);
            }
        }

        return mres;
    }

}