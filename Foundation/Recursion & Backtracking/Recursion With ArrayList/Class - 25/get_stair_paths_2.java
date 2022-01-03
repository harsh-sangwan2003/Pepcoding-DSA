import java.util.Scanner;
import java.util.ArrayList;

public class get_stair_paths_2 {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        ArrayList<String> paths = getStairPaths(n);
        System.out.println(paths);

        scn.close();
    }

    public static ArrayList<String> getStairPaths(int n) {

        if (n == 0) {

            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> mres = new ArrayList<>();

        if (n - 1 >= 0) {
            ArrayList<String> p1 = getStairPaths(n - 1);
            for (String s : p1) {

                mres.add("1" + s);
            }
        }

        if (n - 2 >= 0) {
            ArrayList<String> p2 = getStairPaths(n - 2);
            for (String s : p2) {

                mres.add("2" + s);
            }
        }

        if (n - 3 >= 0) {
            ArrayList<String> p3 = getStairPaths(n - 3);
            for (String s : p3) {

                mres.add("3" + s);
            }
        }

        return mres;
    }

}