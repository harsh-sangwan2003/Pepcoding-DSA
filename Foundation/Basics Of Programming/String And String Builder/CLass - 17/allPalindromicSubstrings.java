import java.util.Scanner;

public class allPalindromicSubstrings {

    public static boolean checkPalindrome(String str) {

        int lo = 0;
        int hi = str.length() - 1;

        while (lo <= hi) {

            char ch = str.charAt(lo);
            char en = str.charAt(hi);

            if (ch != en)
                return false;

            lo++;
            hi--;
        }

        return true;
    }

    public static void solution(String str) {
        // write your code here

        for (int i = 0; i < str.length(); i++) {

            for (int j = i; j < str.length(); j++) {

                String s = str.substring(i, j + 1);
                boolean check = checkPalindrome(s);

                if (check)
                    System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);

        scn.close();
    }

}