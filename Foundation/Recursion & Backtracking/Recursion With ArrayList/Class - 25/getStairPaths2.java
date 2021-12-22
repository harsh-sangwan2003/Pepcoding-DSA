import java.util.ArrayList;
import java.util.Scanner;

public class getStairPaths2 {

    public static ArrayList<String> getPaths(int n) {

        if (n == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> mres = new ArrayList<>();

        if (n >= 1) {
            ArrayList<String> p1 = getPaths(n - 1);
            for (String s : p1) {
                mres.add(1 + s);
            }
        }

        if (n >= 2) {
            ArrayList<String> p2 = getPaths(n - 2);
            for (String s : p2) {
                mres.add(2 + s);
            }
        }

        if (n >= 3) {
            ArrayList<String> p3 = getPaths(n - 3);
            for (String s : p3) {
                mres.add(3 + s);
            }
        }

        return mres;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        ArrayList<String> ans = getPaths(n);
        System.out.println(ans);

        scn.close();
    }
}