import java.util.Scanner;
import java.util.ArrayList;

public class get_stair_paths_2 {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        ArrayList<String> res = getStairPaths(n);

        System.out.println(res);

        scn.close();
    }

    public static ArrayList<String> getStairPaths(int n) {

        if (n == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> p1 = new ArrayList<>();
        ArrayList<String> p2 = new ArrayList<>();
        ArrayList<String> p3 = new ArrayList<>();

        if (n - 1 >= 0)
            p1 = getStairPaths(n - 1);

        if (n - 2 >= 0)
            p2 = getStairPaths(n - 2);

        if (n - 3 >= 0)
            p3 = getStairPaths(n - 3);

        ArrayList<String> mres = new ArrayList<>();

        for (String s : p1) {

            mres.add("1" + s);
        }

        for (String s : p2) {

            mres.add("2" + s);
        }

        for (String s : p3) {

            mres.add("3" + s);
        }

        return mres;
    }

}