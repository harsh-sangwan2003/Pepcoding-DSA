import java.util.Scanner;

public class printPalindromicSubstrings {

    public static void palindromicSubstrings(String str) {

        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j <= str.length(); j++) {

                String ros = str.substring(i, j);

                if (palindrome(ros))
                    System.out.println(ros);
            }
        }
    }

    public static boolean palindrome(String str) {

        int lo = 0;
        int hi = str.length() - 1;

        while (lo <= hi) {

            char st = str.charAt(lo);
            char en = str.charAt(hi);

            if (st != en)
                return false;

            lo++;
            hi--;
        }

        return true;

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        palindromicSubstrings(str);
        scn.close();
    }
}
