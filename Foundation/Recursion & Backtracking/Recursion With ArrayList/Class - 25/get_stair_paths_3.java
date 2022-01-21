import java.util.Scanner;
import java.util.ArrayList;

public class get_stair_paths_3 {

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

        ArrayList<String> mres = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {

            ArrayList<String> paths = new ArrayList<>();

            if (n - i >= 0)
                paths = getStairPaths(n - i);

            for (String s : paths)
                mres.add(i + s);
        }

        return mres;
    }

}