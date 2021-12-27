import java.util.ArrayList;
import java.util.Scanner;

public class get_maze_path_jumps {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        ArrayList<String> ans = getMazePaths(0, 0, n - 1, m - 1);
        System.out.println(ans);

        scn.close();
    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

        if (sr == dr && sc == dc) {

            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> mres = new ArrayList<>();

        for (int count = 1; count + sc <= dc; count++) {

            if (sc + count <= dc) {
                ArrayList<String> hpaths = getMazePaths(sr, sc + count, dr, dc);

                for (String s : hpaths) {

                    mres.add("h" + count + s);
                }
            }
        }

        for (int count = 1; count + sr <= dr; count++) {

            if (sr + count <= dr) {
                ArrayList<String> vpaths = getMazePaths(sr + count, sc, dr, dc);

                for (String s : vpaths) {

                    mres.add("v" + count + s);
                }
            }
        }

        for (int count = 1; count + sr <= dr && count + sc <= dc; count++) {

            if (sr + count <= dr && sc + count <= dc) {
                ArrayList<String> dpaths = getMazePaths(sr + count, sc + count, dr, dc);

                for (String s : dpaths) {

                    mres.add("d" + count + s);
                }
            }
        }

        return mres;
    }
}