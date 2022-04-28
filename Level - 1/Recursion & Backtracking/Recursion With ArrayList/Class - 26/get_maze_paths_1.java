//Time - O(2^n)
//Space - O(n)

import java.util.Scanner;
import java.util.ArrayList;

public class get_maze_paths_1 {

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
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

        if (sr == dr && sc == dc) {

            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        else if (sr > dr || sc > dc)
            return new ArrayList<>();

        ArrayList<String> mres = new ArrayList<>();

        ArrayList<String> hpaths = getMazePaths(sr, sc + 1, dr, dc);

        for (String s : hpaths)
            mres.add("h" + s);

        ArrayList<String> vpaths = getMazePaths(sr + 1, sc, dr, dc);

        for (String s : vpaths)
            mres.add("v" + s);

        return mres;
    }

}