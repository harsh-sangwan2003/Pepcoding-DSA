package Extra;

import java.util.Scanner;

public class isPalindrome {

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

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        System.out.println(checkPalindrome(str));

        scn.close();
    }
}
