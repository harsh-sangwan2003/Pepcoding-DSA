import java.util.ArrayList;
import java.util.Scanner;

public class maze_path_jumps {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        ArrayList<String> ans = getPaths(0, 0, n - 1, m - 1);
        System.out.println(ans);

        scn.close();
    }

    public static ArrayList<String> getPaths(int sr, int sc, int dr, int dc) {

        if (sr == dr && sc == dc) {

            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> mres = new ArrayList<>();

        for (int ms = 1; sc + ms <= dc; ms++) {

            ArrayList<String> hpaths = getPaths(sr, sc + ms, dr, dc);
            for (String s : hpaths) {

                mres.add("h" + ms + s);
            }
        }

        for (int ms = 1; sr + ms <= dr; ms++) {

            ArrayList<String> vpaths = getPaths(sr + ms, sc, dr, dc);
            for (String s : vpaths) {

                mres.add("v" + ms + s);
            }
        }

        for (int ms = 1; sc + ms <= dc && sr + ms <= dr; ms++) {

            ArrayList<String> dpaths = getPaths(sr + ms, sc + ms, dr, dc);
            for (String s : dpaths) {

                mres.add("d" + ms + s);
            }
        }

        return mres;
    }

}