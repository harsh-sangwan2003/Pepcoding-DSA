import java.util.Scanner;
import java.util.ArrayList;

public class get_maze_paths_3 {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        ArrayList<String> ans = getMazePaths(0, 0, n - 1, m - 1);

        System.out.println(ans);

        scn.close();
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column

    static int[][] dir = { { 0, 1 }, { 1, 0 } };
    static String[] dirName = { "h", "v" };

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

        if (sr == dr && sc == dc) {

            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> mres = new ArrayList<>();

        for (int i = 0; i < dir.length; i++) {

            int r = dir[i][0] + sr;
            int c = dir[i][1] + sc;

            ArrayList<String> paths = new ArrayList<>();

            if (r <= dr && c <= dc)
                paths = getMazePaths(r, c, dr, dc);

            for (String s : paths) {

                mres.add(dirName[i] + s);
            }
        }

        return mres;
    }

}