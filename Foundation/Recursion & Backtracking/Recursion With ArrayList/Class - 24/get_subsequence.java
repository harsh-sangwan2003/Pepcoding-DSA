import java.util.ArrayList;
import java.util.Scanner;

public class get_subsequence {

    public static ArrayList<String> subsequence(String str) {

        if (str.length() == 0) {

            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> rres = subsequence(ros);
        ArrayList<String> mres = new ArrayList<>();

        for (String s : rres) {

            mres.add("" + s);
        }

        for (String s : rres) {

            mres.add(ch + s);
        }

        return mres;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();

        ArrayList<String> ans = subsequence(str);
        System.out.println(ans);

        scn.close();
    }
}