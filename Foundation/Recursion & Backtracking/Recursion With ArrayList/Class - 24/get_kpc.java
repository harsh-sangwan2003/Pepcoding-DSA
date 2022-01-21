import java.util.Scanner;
import java.util.ArrayList;

public class get_kpc {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();

        ArrayList<String> ans = getKPC(str);
        System.out.println(ans);

        scn.close();
    }

    private static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static ArrayList<String> getKPC(String str) {

        if (str.length() == 0) {

            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> rres = getKPC(ros);
        ArrayList<String> mres = new ArrayList<>();

        for (int i = 0; i < codes[ch - '0'].length(); i++) {

            for (String s : rres) {

                mres.add(codes[ch - '0'].charAt(i) + s);
            }
        }

        return mres;
    }

}